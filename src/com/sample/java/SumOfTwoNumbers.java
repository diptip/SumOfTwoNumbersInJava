package com.practice.maven.applications.practicemavenapps;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	public static int num1, num2;
	public static int sum;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("This java application print sum of two numbers");
		TakeInputsFromUser();
		SumOfTwoNumbers();
	}

	/*
	 * This method takes input from users
	 */
	private static void TakeInputsFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		sc.close();
	}

	/*
	 * this method do addition of numbers
	 * 
	 */
	private static void SumOfTwoNumbers() {
		sum = num1 + num2;
		System.out.println("Result of sum of two numbers is: " + sum);

	}
}
