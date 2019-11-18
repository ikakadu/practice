package com.iq;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;


public class CreateTime {

	public static void main(String[] args) {
//		firstT();
		int i=4;
		int m=4;
		int c = (i++)+(i++)+(++i);
		System.out.println(c);
		System.out.println();
	}

	public static void firstT() {
		int day =3;
		int flag = 0;
		Calendar calStart = Calendar.getInstance();
		calStart.set(Calendar.HOUR_OF_DAY, 9);//时 
		calStart.set(Calendar.MINUTE, 01);//分 
		calStart.set(Calendar.SECOND, 00);//秒 
		calStart.set(Calendar.MILLISECOND, 00);//
		
		Calendar calEnd = Calendar.getInstance();
		calEnd.set(Calendar.HOUR_OF_DAY, 16);//时 
		calEnd.set(Calendar.MINUTE, 30);//分 
		calEnd.set(Calendar.SECOND, 00);//秒 
		calEnd.set(Calendar.MILLISECOND, 00);// 
		
		List<String> list = new ArrayList<String>();
		
		
		while(calStart.before(calEnd)&&day>0) {
			String time = DateFormatUtils.format(calStart.getTime(), "yyyy/MM/dd HH:mm:ss");
			list.add(time);
//			System.out.println(list.get(list.size()-1));
			
			if(flag == 0) {
				calStart.add(Calendar.MINUTE, 14);
				++flag;
			}else {
				calStart.add(Calendar.MINUTE, 15);
			}
			
			if(calStart.get(Calendar.HOUR_OF_DAY)==calEnd.get(Calendar.HOUR_OF_DAY)
					&&calStart.get(Calendar.MINUTE)==calEnd.get(Calendar.MINUTE)
					) {
				
				list.add(DateFormatUtils.format(calStart.getTime(), "yyyy/MM/dd HH:mm:ss"));
				
				calStart.add(Calendar.DAY_OF_YEAR, -1);
				calStart.set(Calendar.HOUR_OF_DAY, 9);//时 
				calStart.set(Calendar.MINUTE, 01);//分 
				
				calEnd.add(Calendar.DAY_OF_YEAR, -1);
				calEnd.set(Calendar.HOUR_OF_DAY, 16);//时 
				calEnd.set(Calendar.MINUTE, 30);//分 
				day--;
				flag = 0;
//				continue;
			}
		}
		
//		System.out.println(list);
		
		List<List<String>> listAll = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<String>();
		for (int i = 0; i < list.size()/3; i++) {
			int hoursPerDay = list.size()/3;
			temp.add(list.get(i));
			temp.add(list.get(i+hoursPerDay));
			temp.add(list.get(i+hoursPerDay*2));
			listAll.add(temp);
			temp = new ArrayList<String>();
		}
		
		
		System.out.println(listAll);
		
	}
	
	

}
