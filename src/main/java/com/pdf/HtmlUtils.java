package com.pdf;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

/**
 * html工具类
 *
 * @author shw
 * @create 2020-01-10
 **/
@Slf4j
public class HtmlUtils {
//    private static Logger LOGGER = LoggerFactory.getLogger(com.lagofx.mchtweb.util.HtmlUtils.class);

    /**
     * 解析字符串模板,通用方法
     *
     * @param template      字符串模板
     * @param model         数据
     * @param configuration 配置
     * @return 解析后内容
     */
    public static String process(String template, Map<String, ?> model, Configuration configuration)
            throws IOException, TemplateException {
        if (template == null) {
            return null;
        }
        if (configuration == null) {
            configuration = new Configuration();
        }
        StringWriter out = new StringWriter();
        new Template("template", new StringReader(template), configuration).process(model, out);
        return out.toString();
    }

    /**
     * html模板填充数据
     *
     * @param filePath 文件路径
     * @param map      需要填充的数据
     * @return
     */
    public static String fillData(String filePath, Map<String, Object> map) {
        if (org.apache.commons.lang.StringUtils.isEmpty(filePath)) {
            log.error("html模板文件内容为空");
            return null;
        }
        try {
            // 读取html模板
            String htmlContent = FileUtils.ReadFile(filePath);
            if (org.apache.commons.lang.StringUtils.isEmpty(htmlContent)) {
                log.error("读取html模板文件内容为空");
                return null;
            }

            try {
                // 解析字符串模板的方法，并返回处理后的字符串
                return process(htmlContent, map, null);
            } catch (TemplateException e) {
                log.error("html模板文件填充数据异常：{}", e);
            }
        } catch (IOException e) {
            log.error("html模板文件填充数据异常：{}", e);
        }

        return null;
    }
}
