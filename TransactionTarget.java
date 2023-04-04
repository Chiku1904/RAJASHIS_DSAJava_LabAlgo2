package com.greatlearning.lab2;

import java.util.Scanner;

public class TransactionTarget {

	static int sum;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of transactions");
		int size = sc.nextInt();
		int[] transaction = new int[size];
		int i;
		for (i = 0; i < size; i++) {
			System.out.println("Enter the value of transactions " + (i + 1));
			transaction[i] = sc.nextInt();
		}
		System.out.println("Enter the no of targets");
		int target = sc.nextInt();

		for (i = 1; i <= target; i++) {
			System.out.println("\nEnter the amount of target no " + i);
			int targetAmount = sc.nextInt();

			sum = 0;
			int flag = 0;
			for (int j = 0; j < transaction.length; j++) {
				sum += transaction[j];
				if (sum >= targetAmount) {
					flag = 1;
					System.out.println("Target is acheived on transcation number " + (j + 1));
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Sorry, Targer is not acheived!");
			}
		}
	}
}
