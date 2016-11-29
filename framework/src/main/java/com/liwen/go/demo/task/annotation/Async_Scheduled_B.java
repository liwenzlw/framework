package com.liwen.go.demo.task.annotation;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Async_Scheduled_B {

	@Autowired
	Async_Scheduled_A async_Scheduled_A;
	
	public void testAsync() throws InterruptedException, ExecutionException {
		System.out.println("Async_Scheduled_B:" + Thread.currentThread().getName());
		async_Scheduled_A.noParam();
		async_Scheduled_A.withParam("withParam");
		Future<String> withReturn = async_Scheduled_A.withReturn(8);
		System.out.println("async返回值：" + withReturn.get());
		
		withReturn = async_Scheduled_A.withException(8);
		try {
			withReturn.get();
		}catch(ExecutionException e) {
			System.out.println("异常信息：" + e.getMessage());
		}
	}
}
