package com.boot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.Future;

@Service
public class AsyncTaskService {
	Random random = new Random();// 默认构造方法

	@Async
	// 表明是异步方法
	// 无返回值
	public void executeAsyncTask(String msg) {
		System.out.println(Thread.currentThread().getName()+"开启新线程执行" + msg);
	}

	/**
	 * 异常调用返回Future
	 *
	 * @param i
	 * @return
	 * @throws InterruptedException
	 */
	@Async
	public Future<String> asyncInvokeReturnFuture(int i) throws InterruptedException {
		System.out.println("input is " + i);
		Thread.sleep(1000 * random.nextInt(i));

		Future<String> future = new AsyncResult<String>("success:" + i);// Future接收返回值，这里是String类型，可以指明其他类型

		return future;
	}
}
