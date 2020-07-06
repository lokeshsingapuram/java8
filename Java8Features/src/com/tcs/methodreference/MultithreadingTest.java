package com.tcs.methodreference;

public class MultithreadingTest {
	
	public void m2() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
 public static void main(String[] args) {
	 MultithreadingTest t=new MultithreadingTest();
	 
	 Runnable r=t::m2;
	 Thread th=new Thread(r);
	 th.start();
	 for(int i=0;i<10;i++) {
		 System.out.println("main thread");
	 }
	
}
}
