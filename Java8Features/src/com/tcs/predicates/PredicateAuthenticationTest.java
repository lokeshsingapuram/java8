package com.tcs.predicates;

 import java.util.Scanner;
import java.util.function.Predicate;
import com.tcs.model.User;

public class PredicateAuthenticationTest {
	
	public static void main(String[] args) {
		Predicate<User>  userTest=user->user.getUserName().equalsIgnoreCase("durga")&&user.getPassword().equals("java");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Name::");
		String userName=sc.next();
		System.out.println("Enter Passowrd");
		String password=sc.next();
		User user=new User(userName, password);
		if(userTest.test(user)) {
			System.out.println("valid user");
			sc.close();
		}
		else {
			System.out.println("invalid user");
		}
	}

}
