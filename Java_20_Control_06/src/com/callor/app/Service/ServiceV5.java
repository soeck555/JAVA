package com.callor.app.Service;

import java.util.Scanner;

import com.callor.app.utils.LinePrint;

public class ServiceV5 {
	
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;
	
	public int scoreSum() {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(LinePrint.dLine);
		System.out.println("나라 고교 성적처리 V1");
		System.out.println(LinePrint.sLine);
		System.out.println("다음 성적을 50~100 점을 범위에서 입력하세요");
		
		System.out.println("국어>");
		intKor = scan.nextInt();
		
		System.out.println("영어>");
		intEng = scan.nextInt();
		
		System.out.println("수학>");
		intMath = scan.nextInt();
		
		int intSum = intKor + intEng + intMath;
		return intSum;
		
	}//
	public void scorePrint() {
		String dLine = "=";
		String sLine = new String("-");
		int intKor = (int)(Math.random() *100) +1;
		int intEng = (int)(Math.random() *100) +1;
		int intMath = (int)(Math.random() *100) +1;
		
		System.out.println(dLine.repeat(50));
		System.out.println("철수의 성적표");
		System.out.println(sLine.repeat(50));
		System.out.println("국어 : \t" + intKor);
		System.out.println("영어 : \t" + intEng);
		System.out.println("수학 : \t" + intMath);
		System.out.println(sLine.repeat(50));
		
		// 현재 클래스의 총점 계산 method 를 호출하여 총점 받아오기
		int intSum = scoreSum();
		System.out.println("총점 : \t " + intSum);
		System.out.println(dLine.repeat(50));
		
	}
		
}
