package com.it.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;


public class FileToRedis {

	public static void main(String[] args) throws Exception {	
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("localhost",6379);
		Pipeline pipeline = jedis.pipelined();  
		List<String> list = new LinkedList<String>(); 
		List<redisDto> listDto = new LinkedList<redisDto>(); 
		URL url = FileToRedis.class.getResource("/");
		System.out.println(url);
		File file = new File("E:\\eclipse-workspace-2018-12\\test\\src\\main\\java","rr.txt"); 
		@SuppressWarnings("resource")
		BufferedReader input = new BufferedReader(new FileReader(file));
		String text; 
		
		
		while((text=input.readLine())!=null) {
			list.add(text);   
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			String[] split = list.get(i).split(" ");
			redisDto dto = new redisDto();
			Map<String,String> map0=new HashMap<String,String>();
			if(split.length!=7) {
				return;
			}
			for(int n = 0;n<split.length;n++) {
//				map0.put("债券代码", split[0]);
//				map0.put("净价", split[1]);
//				map0.put("清算速度", split[2]);
				map0.put("到期收益率", split[3]);
				map0.put("行权收益率", split[4]);
				map0.put("应计利息", split[5]);
				map0.put("每百元金额", split[6]);
				
				  dto.setBondCd(split[0]); 
				  dto.setNetPrc(split[1]); 
				  dto.setStlSpd(split[2]);
				  dto.setMap(map0);
			 /* * dto.setYldToMrty(split[3]); 
				 * dto.setExrcsYld(split[4]);
				 * dto.setAcrdIntrst(split[5]); 
				 * dto.setPrncplPerHndrdYuan(split[6]);
				 */
			}
			listDto.add(dto);
		} 
		Gson gson = new Gson();
		for(redisDto dto:listDto) {
//			System.out.println(dto);
			pipeline.set(dto.getBondCd()+dto.getNetPrc()+dto.getStlSpd(), dto.getMap().toString());
			System.out.println(pipeline.get(dto.getBondCd()+dto.getNetPrc()+dto.getStlSpd()));
		}
		 //提交
        pipeline.sync();       
	    input.close();
		
	}

}
