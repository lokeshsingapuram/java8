package com.tcs.methodreference;

import com.tcs.interfaces.InterMethodrefernce;

public class ConstructorReferTest {
	public static void main(String[] args) {
		InterMethodrefernce ref = Sample::new;
		ref.m1();
	}
}
