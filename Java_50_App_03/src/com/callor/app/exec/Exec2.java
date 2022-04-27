package com.callor.app.exec;

public class Exec2 {

	public static void main(String[] args) {

		int[] intNum1 = new int[10];

		for (int i = 0; i < intNum1.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intNum1[i] = num;
		}
		int intSum = 0;
		for (int i = 0; i < intNum1.length; i++) {
			intSum += intNum1[i];
		}
		System.out.println(intSum);
	}

}
