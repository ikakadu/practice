package com.excel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

public class ImportExcelTest {

	public static void main(String[] args) throws Exception{
		/**
		 * 测试导入excel
		 */

//		InputStream in=new FileInputStream("");//excel文件
		InputStream in = new FileInputStream("src\\main\\resources\\节假日记录.xlsx");//excel文件
		Workbook book = ImportExcelUtil.getWorkBook(in);
		List<List<Object>> list = ImportExcelUtil.getBankListByExcel(book);
		in.close();
		if(list!=null&&list.size()>0) {
			for(int i=0;i<list.size();i++) {
				List<Object> lo=list.get(i);
				Object[] s = lo.toArray();//代表着Excel每一行的单元格的内容,s[0]代表第一个单元格的类容
				for(int k=0;k<lo.size();k++){
					System.out.print(lo.get(k)+" ");
				}
				System.out.println();
			}
		}

	}

}
