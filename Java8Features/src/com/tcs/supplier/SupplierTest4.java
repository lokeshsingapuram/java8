package com.tcs.supplier;

import java.util.function.Supplier;

public class SupplierTest4 {
	public static void main(String[] args) {

		Supplier<String> randomPasswords=()->{
			
			String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Integer> digits=()->(int)(Math.random()*10);
			Supplier<Character> characters=()->symbols.charAt((int)Math.random()*29);
			String pwd="";
			for(int i=1;i<=8;i++) {
				if(i%2==0) {
					pwd=pwd+digits.get();
				}
				else {
					pwd=pwd+characters.get();
				}
			}
			
			
			return pwd;
			
		};
System.out.println(randomPasswords.get());
System.out.println(randomPasswords.get());
System.out.println(randomPasswords.get());


	}
}