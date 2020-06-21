package com.tcs.comparator;

public class ThreadDemoUsingLambda {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread");
			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		
	}

}
