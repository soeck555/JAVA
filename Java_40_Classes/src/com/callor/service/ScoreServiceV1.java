package com.callor.service;

import java.util.Scanner;

import com.callor.classes.utls.Line;

public class ScoreServiceV1 {
	/*
	 * 상속을 염두에 두고 클래스를 선언할때는
	 * 인스턴스 변수들을 private 이 아닌 protected 로 선언한다
	 * 
	 * protected private 의 성질을 가지면서
	 * 상속받은 클래스에서 상속받아 변수를 선언한 것과 같은 효과를 낸다
	 * 인스턴스 변수도 상속이 된다
	 */
	protected String[] students;
	protected int[] intKor;
	protected int linelength;
	protected Scanner scan;
	
	public ScoreServiceV1() {
		this(10);
	}
	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		linelength = 50;
		//scan = new Scanner;
		scan = new Scanner(System.in);
	}
	
	public int input() {
		System.out.println(Line.dLine(linelength));
		System.out.println("빛나라 고교 성적처리 v1");
		System.out.println(Line.sLine(linelength));
		
		int index = 0;
		for(index = 0; index < students.length ; index++) {
			int stNum = index + 1;
			System.out.printf("%d 번 학생 이름 : ", index +1);
			
			// 키보드에서 문자열 입력받기
			String strName = scan.nextLine();
			
			// 이름대신 END 문자열을 입력하면 입력받기를 중단한다
			if(strName.equals("End")) {
				break;
			}
			// 학생이름을 배열에 저장할때는 if() 다음에 위치해야 한다
			// 만약 if() 위에 코드를 위치하면, 중단 되기전에
			// students[index] 요소에 END 문자열이 먼저 저장 되기 때문에
			// 학생 이름에 END 가 나타 날 것이다
			students[index] = strName;
			
			System.out.printf("%d 번 국어점수 : >", stNum);
			//int intScore = scan.nextInt();
			//intKor[index] = intScore;
			String strScore = scan.nextLine();
			int intScore = 0;
			if(strScore.equals("")) {
				System.out.println("점수는 숫자만 가능~~");
			}else {
				intScore = Integer.valueOf(strScore);
			}
			intKor[index] = intScore;
		}
		return 0;
	}
	
	public void print() {
		for(int i = 0 ; i < students.length ; i++) {
			System.out.printf("%s\t" , students[i]);
		}
		System.out.println();
	}
}
