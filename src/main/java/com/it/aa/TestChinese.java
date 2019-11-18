package com.it.aa;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class TestChinese {

	public static void main(String[] args) {
		 int j=0;
		 int x=3;
	        switch (x) {
	        case 1:j++;
	        case 2:j++;
	        case 3:j++;
	        case 4:j++;
	        case 5:j++;
	        case 6:j++;
	        default:j++;
	        }
	        
	        System.out.println(j);
	        
	        System.out.println( System.currentTimeMillis());
	        System.out.println( Calendar.getInstance().getTimeInMillis());
	        System.out.println( Clock.systemDefaultZone().millis());
	        System.out.println(LocalDate.now());
//	        		System.out.println( LocalTime.now().get(field));
	        		System.out.println( LocalDateTime.now().getNano());
	        
	}
	
	
    
}
