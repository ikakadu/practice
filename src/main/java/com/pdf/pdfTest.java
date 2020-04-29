package com.pdf;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class pdfTest {

    @GetMapping("/create/pdf")
    public  String getReceiptPdf(HttpServletRequest request, HttpServletResponse response) throws Exception {


        CashOutTransQueryResp cashOutTransQueryResp = new CashOutTransQueryResp();
        cashOutTransQueryResp.setCashOutAccount("112233");



        Map<String, Object> receiptHtmlData = getReceiptHtmlData(cashOutTransQueryResp);
        // 组装模板名称
        String templateName = "trade_receipt.html";
        // 模板目录
//        String templateDir = new File( "templates").getPath();
        String resourcePath = ClassLoader.getSystemResource("").getPath();
        System.out.println(resourcePath);

//        String templateDir = new File(File.separator, "templates").getPath();
        String fileName = "提现回单_" + DateUtil.format(LocalDateTime.now(), DatePattern.PURE_DATETIME_PATTERN)+".pdf";
        // 获取模板内容
        String templateContent = HtmlUtils.fillData(resourcePath + new File(resourcePath, templateName).getPath(), receiptHtmlData);

        // css样式文件地址
        String cssFilePath = resourcePath + new File(resourcePath, "receipt_style.css").getPath();
//        String cssFilePath = System.getProperty("user.dir") + new File(templateDir, "receipt_style.css").getPath();

//        return PdfUtils.html2PdfAndDownload(templateContent, response, cssFilePath, SysConstants.ENCODING_UTF_8, fileName);
        ByteArrayOutputStream baos = PdfUtils.html2PdfOutputStream(templateContent, cssFilePath, "utf-8");
        return PdfUtils.downloadSinglePdf(response,fileName,baos);
    }



    private  Map<String, Object> getReceiptHtmlData(CashOutTransQueryResp CashOutTransQueryResp) {
        String templateDir = new File(File.separator, "templates").getPath();
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("dto", CashOutTransQueryResp);
        dataMap.put("lklLogo", System.getProperty("user.dir") + new File(templateDir, "lklLogo.png").getPath());
        dataMap.put("ckcgImagePath", System.getProperty("user.dir") + new File(templateDir, "ckcg.png").getPath());
        return dataMap;
    }

    @GetMapping("/create/pdfzip")
    public  String getReceiptPdfZip(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<CashOutTransQueryResp> cashOutTransQueryRespList = null;
        Map<String, byte[]> receiptPdfZip = createWithdrawalReceiptPdfZip(cashOutTransQueryRespList);
        return PdfUtils.downloadBatchByFile(response, receiptPdfZip, "FILE_NAME_RECEIPT");

    }

    public  Map<String, byte[]>  createWithdrawalReceiptPdfZip(List<CashOutTransQueryResp> cashOutTransQueryRespList) throws Exception {
        Map<String, byte[]> files = new HashMap<>();
        for (CashOutTransQueryResp dto: cashOutTransQueryRespList) {
            Map<String, Object> receiptHtmlData = getReceiptHtmlData(dto);

            // 组装模板名称
            String templateName = "trade_receipt.html";
            // 模板目录
            String templateDir = new File(File.separator, "templates").getPath();
            String fileName = "提现回单" + "_" + dto.getCashOutId()+".pdf";
            // 获取模板内容
            String templateContent = HtmlUtils.fillData(System.getProperty("user.dir") + new File(templateDir, templateName).getPath(), receiptHtmlData);

            // css样式文件地址
            String cssFilePath = System.getProperty("user.dir") + new File(templateDir, "receipt_style.css").getPath();

            ByteArrayOutputStream baos = PdfUtils.html2PdfOutputStream(templateContent, cssFilePath, "UTF-8");
            files.put(fileName,baos.toByteArray());
        }
        return files;
    }
}
