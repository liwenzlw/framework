package com.liwen.go.demo.task.annotation;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class Scheduled_Annotation {
	@Scheduled(fixedDelay = 5000)
	public void fixedDelay() {
		System.out.println("fixedDelay:" + new Date());
	}

	@Scheduled(fixedRate = 5000)
	public void fixedRate() {
		System.out.println("fixedRate:" + new Date());
	}

	@Scheduled(initialDelay = 1000, fixedRate = 5000)
	public void initialDelay() {
		System.out.println("initialDelay:" + new Date());
	}

	@Scheduled(cron = "*/5 * * * * MON-FRI")
	public void cron() {
		System.out.println("cron:" + new Date());
	}
}
