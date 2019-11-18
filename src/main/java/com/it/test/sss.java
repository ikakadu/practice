package com.it.test;

import java.sql.Timestamp;
import java.util.Date;

public class sss {

	
		  public static sss t1 = new sss();
		    public static sss t2 = new sss();
		    
		    {
		        System.out.println("构造块");
		    }
		    static
		    {
		        System.out.println("静态块");
		    }
		    public static void main(String[] args)
		    {
		    	System.out.println("-----");
		        sss t = new sss();
		    }

	

}
