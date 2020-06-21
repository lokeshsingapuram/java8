package com.tcs;

import com.tcs.interfaces.ILambdaexpression2;

public class ILambdaExpression2{
public static void main(String[] args) {
	ILambdaexpression2 exp1=(a,b)->System.out.println("sum of two numbres:"+(a+b));
	exp1.Addition(20, 30);
	exp1.Addition(50, 60);
}
}
