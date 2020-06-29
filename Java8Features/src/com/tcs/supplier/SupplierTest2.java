package com.tcs.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest2 {

	public static void main(String[] args) {
		Supplier<Date> d=( )->{
			return new Date();
		};
		System.out.println(d.get());
	}
}
