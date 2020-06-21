package com.tcs;

import com.tcs.interfaces.ILambdaExpression3;

public class ILambdaExample3  {

	
	public static void main(String[] args) {

		ILambdaExpression3 exp3=(s)->System.out.println(s.length());
		exp3.getLength("lokesh");
		Thread t=new Thread(
			    () -> {
			    	System.out.println("My Runnable");
			    	}
			);
		t.start();

	}

}
