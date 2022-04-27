package com.callor.arrays.service;

public class ServiceV1 {
	int intNum1 = 0;
	int intNum2 = 0;
	int intNum3 = 0;
	int intNum4 = 0;
	int intNum5 = 0;
	
	
	public int scoreKorSum() {
		
		int intNum1=(int)(Math.random()*100) +1;
		int intNum2=(int)(Math.random()*100) +1;
		int intNum3=(int)(Math.random()*100) +1;
		int intNum4=(int)(Math.random()*100) +1;
		int intNum5=(int)(Math.random()*100) +1;
		
		int intSum= intNum1 + intNum2 +intNum3 +intNum4 +intNum5;
		return intSum;
	}
	
}
