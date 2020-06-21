
package com.tcs;

public interface interf {
	public void m1();
	default void m2() {
		System.out.println("default method");
	}

}
