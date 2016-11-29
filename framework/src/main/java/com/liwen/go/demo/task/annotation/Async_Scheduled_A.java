package com.liwen.go.demo.task.annotation;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

//@Component
public class Async_Scheduled_A {
	@Async
	public void noParam() {
		System.out.println("noParam:" + Thread.currentThread().getName());
	}
	
	@Async
	public void withParam(String s) {
		System.out.println("withParam:" + Thread.currentThread().getName());
	}
	
	@Async
	public Future<String> withReturn(int i) throws InterruptedException {
		System.out.println("withReturn:" + Thread.currentThread().getName());
		Thread.currentThread().sleep(3000);
		return new AsyncResult<String>("withReturn:" + i);
	}
	
	@Async
	public Future<String> withException(int i) {
		System.out.println("withException:" + Thread.currentThread().getName());
		if(true){
			throw new RuntimeException("Future返回值携带的异常信息");
		}
		return new AsyncResult<String>("withReturn:" + i);
	}
}
