package com.tcs;

import com.tcs.interfaces.ILambdaExpressions;

public class ILambdaExample1 {
	

	public static void main(String[] args) {
/* lambda Expressions:
 * 
* lambda expressions is anonymous function
* properties of lambda functions:
*method should have no name,modifier,return type
*examples
*   ()->{sout("hello)}
*   (int a,int b)->sout(a+b)
*   (a,b)->sout(a+b)
*   (s)->sout(lokesh)
*   s->{return s.length}
*   s->s.length
*   if lambda expression having one statement then no need of curly braces
*   lambda expressions automatically guess all types of parameters 
*   no need of return type also
*/
ILambdaExpressions expressions=()->System.out.println("hello zero paramter");
expressions.Hello();
	}

}
