package com.it.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class RedisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String getString(String... args){  
	        StringBuilder sb = new StringBuilder();  
	        sb.append("*").append(args.length).append("\r\n");  
	        for(String arg : args){  
	            sb.append("$").append(arg.length()).append("\r\n");  
	            sb.append(arg).append("\r\n");  
	        }  
	        return sb.toString();  
	    }  
	      
	    public void initFile2(){  
	        String file= "F:\\2.txt";  
	        BufferedWriter w = null;  
	        StringBuilder sb = new StringBuilder();  
	        try {  
	            w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));  
	            for(int i=1 ;i <= 1000000;i++){  
	                if(i/30000 == 0){  
	                    w.flush();  
	                }  
	                sb.setLength(0);  
	                sb.append(this.getString("hmset","usr"+i,"userid","usr"+i,"username","usrname"+i));  
	                w.append(sb.toString());  
	            }  
	        } catch (UnsupportedEncodingException e) {  
	            e.printStackTrace();  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        } finally{  
	            try {  
	                w.flush();  
	                w.close();  
	            } catch (IOException e) {  
	                e.printStackTrace();  
	            }  
	              
	        }  
	    }  

}
