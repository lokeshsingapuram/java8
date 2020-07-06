package com.tcs.methodreference;

import com.tcs.interfaces.InterMethodrefernce;

public class MethodReferenceTest1 {

	public static void m2() {
		System.out.println("method reference");
	}
	public void m3() {
		System.out.println("object refernce");
	}
	public static void main(String[] args) {
		MethodReferenceTest1 t=new MethodReferenceTest1();
		//static reference
		InterMethodrefernce i=MethodReferenceTest1::m2;
		i.m1();
		//instance reference
		InterMethodrefernce i1=t::m3;
		i1.m1();
	}
}
