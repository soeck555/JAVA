package com.callor.app.exec;

public class Exec1 {

	public static void main(String[] args) {

		int[] intNum1 = new int[10];
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intNum1[i] = num;

		}
		for (int i = 0; i < intNum1.length; i++) {

			System.out.println(intNum1[i]);
		}

	}

}
