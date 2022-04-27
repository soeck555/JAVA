package com.callor.arrays.exexc;

public class ExecV4 {
	public static void main(String[] args) {
		int[] intNum1 = new int[100];
		int index = 0;
		for (index = 0; index < intNum1.length; index++) {
			intNum1[index] = (int) (Math.random() * 100) + 1;
		}

		// 짝수인 수를 덧셈할 변수를 선언
		int intNum2 = 0;
		for (index = 0; index < intNum1.length; index++) {
			boolean bEven = intNum1[index] % 2 == 0;
			if (bEven) {
				// intNum2 = intNum2 + intNum1[index]
				intNum2 += intNum1[index];
			}
		}
		System.out.println("짝수들의 합 : " + intNum2);
	}
}
