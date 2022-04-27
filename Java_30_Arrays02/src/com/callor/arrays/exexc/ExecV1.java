package com.callor.arrays.exexc;

public class ExecV1 {
	public static void main(String[] args) {
		int intNum1 = 0;

		intNum1 = (int) (Math.random() * 100) + 1;
		
		boolean bEven = false;
		//intNum 변수를 2로 나눈 나머지가 0이냐?
		//intNum 변수에 담긴 값을 2로 나눈 나머지가 0이냐?
		//0이면 true 가 bEven 에 저장, 아니면 false가 bEven에 저장된다
		bEven = (intNum1 %2) == 0;
		
		if (intNum1 % 2 == 0) {
			System.out.println(intNum1 + "은 짝수");
		} else {
			System.out.println(intNum1 + "은 홀수");
		}

	}

}
