package com.callor.arrays.exexc;

public class ExecV2 {
	public static void main(String[] args) {
		int[] intNum1 = new int[100];
		// for() 명령문의 선언부에서 변수를 선언하면
		// for() {} 이 끝날때 변수소멸
		// 같은 method 내에서 같은 이름의 변수를 사용할수 있다
		int index = 0;
		for (index = 0; index < intNum1.length; index++) {
			intNum1[index] = (int) (Math.random() * 100) + 1;
		}
		for(index = 0; index <intNum1.length; index ++);
			boolean bEven = (intNum1[index] % 2) ==0;
			if(bEven) {
				System.out.printf("\t%d 는 짝수 \n" , intNum1[index]);
			} else {
				System.out.printf("\t%d 는 짝수 아님 \n" , intNum1[index]);
			}
	}
}