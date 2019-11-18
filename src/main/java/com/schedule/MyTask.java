package com.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTask {
	
	@Scheduled(cron="0/3 * * * * *")
//	@Scheduled(fixedRate=5000)
	public void work() {
		System.out.println("定时任务"+new Date());
	}
}
