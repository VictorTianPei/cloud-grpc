package com.boot;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Consumer1 {


	@Resource
	private AsyncTaskService asyncTaskService;


	public void test(String msg){
		System.out.println(Thread.currentThread().getName()+":"+msg);

		asyncTaskService.executeAsyncTask(msg);

	}

}