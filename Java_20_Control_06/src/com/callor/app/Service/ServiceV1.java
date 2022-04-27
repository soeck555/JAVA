package com.callor.app.Service;

public class ServiceV1 {
	public int scoreSum() {
		int intKor = 0;
		int intEng = 0;
		int intMatha = 0;
		
		int Kor=(int)(Math.random()*100)+1;
		int Eng=(int)(Math.random()*100)+1;
		int Matha=(int)(Math.random()*100)+1;
		
		int intSum = intKor +intEng + intMatha ;
		return intSum;
		
	}
	
}
