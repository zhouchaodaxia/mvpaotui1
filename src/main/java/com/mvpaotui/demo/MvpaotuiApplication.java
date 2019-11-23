package com.mvpaotui.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvpaotuiApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(MvpaotuiApplication.class, args);

		keepRunning();
	}

	private static void keepRunning() throws InterruptedException {
		Thread t = Thread.currentThread();

		synchronized (t) {
			t.wait();
		}
	}

}
