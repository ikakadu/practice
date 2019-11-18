package com.it.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	String s0 = "asdfgQEWEEGTREd";//6
    	String s1 = "asdfgh";//6
    	String s2 = "qweASADF";//3
    	String s3 = "AsdQEFW";//2
    	List<String> list = new ArrayList<String>();
    	list.add(s0);
    	list.add(s1);
		/*
		 * list.add(s2); list.add(s3);
		 */	
    	int a = ss1(list);    	   	
    	System.out.println(a);
    }
    public static int ss1(List<String> str) {
    	int count=0;
    	Map<String,String> map = new HashMap<String,String>();
    	for(int i=0;i<str.size();i++) {
    		int j = ss(str.get(i));
    		if(i==0) {
    			count=j;
    			map.put("string", str.get(0));
    		}
    		if(j<count) {
    			count=j;
    			map.put("string", str.get(i));
    		}
    	}
    	System.out.println(map.get("string"));
    	return count;
    }
    
    public static int ss(String str) {
    	int index=0;
    	if(StringUtils.isBlank(str)) {
    		return 0;
    	}
    	for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			boolean b = Character.isLowerCase(c);
			if(b==true) {
				index++;
			}
		}
		return index;
	}
    
    private static double del(int i) {
    	
    	
		return i;
    	
    }
    
    private static double dou(int i) {
    	if(i==1) {
    		
    		return 10;
    	}
		return dou(i-1)+2;
    	
    }
    
    private static double dou1(int i) {
    	return 10+(i-1)*2;
    }

	private static void day() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			SimpleDateFormat sdf1 = new SimpleDateFormat("HH:MM:SS");
			String issDayB = "2018/11/01";
			String issDayE = "2018/12/20";
			
			String t1 = "22:19:23";
			String t2 = "10:02:23";
			
			System.out.println(t1.compareTo(t2));
			System.out.println(t2.compareTo(t1));
			
//    	long isDayB = new Date(issDayB).getTime();
//    	long isDayE = new Date(issDayE).getTime(
//			System.out.println(LocalDate.now());;
			
			
			/*long isDayE = sdf.parse(issDayE).getTime()*/;
		/*	Calendar instance = Calendar.getInstance();
			
			System.out.println(":"+isDayB +","+ isDayE +","+ (isDayE - isDayB));
			
			long d = (isDayE - isDayB)/(24*60*60*1000);
			System.out.println(d);
			*/
	}

	private static void listSet() {
		List<String> list=new ArrayList<String>();

	    list.add("保护环境");  //向列表中添加数据

	    list.add("爱护地球");  //向列表中添加数据

	    list.add("从我做起");  //向列表中添加数据

	    System.out.println(list);
	    
	    String ret=list.set(1,"少用塑料袋");

	    System.out.println(list);
	}

	private static void replace() {
		String Str = new String("hello runoob，I am from runoob。1123");

//         System.out.print("返回值 :" );
//         System.out.println(Str.replaceFirst("runoob", "google" ));
//         System.out.print("返回值 :" );
	}

	private static void time() {
		//         Calendar ca = new Calendar();
		         Calendar instance = Calendar.getInstance();//TimeZone.getTimeZone("GMT")
		         instance.add(instance.MONTH, -1);
		         String time = DateFormatUtils.format(instance, "yyyy-MM-dd HH:mm:ss.SSS");
		    	 System.out.println(time);
		    	 instance.setTime(new Date("2018/12/23"));
		    	 instance.add(instance.DAY_OF_MONTH, 20);
		    	 String time1 = DateFormatUtils.format(instance, "yyyy-MM-dd HH:mm:ss.SSS");
		    	 System.out.println(time1);
	}
    
    public static String tr(Object o) {
    	if(o==null) {
    		return "";
    	}else {
    		return o.toString();
    	}
    }
    
    
    
}
