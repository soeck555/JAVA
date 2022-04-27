package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		lineLength = 50;
	}

	public int input() {

		System.out.println(Line.dLine(50));
		System.out.println("대한 고교 성적처리 V2");
		System.out.println(lineLength);
		int index = 0;
		while (index < student.length) {

			System.out.print("이름(END:중단)>> ");
			String strName = scan.nextLine();

			System.out.print("점수(정수로, END;중단>>");
			String strKor = scan.nextLine();
			
		}
		
		return 0;
	}

}
