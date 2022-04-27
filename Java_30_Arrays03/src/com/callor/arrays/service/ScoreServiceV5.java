package com.callor.arrays.service;

import com.callor.arrays.utills.Line;

/*
 * makeScore()
 * pritScore()
 * sumScore()
 * 
 * 등의 method 를 선언하고
 * 임의 성적을 생성하여 intKor 에 저장
 * 성정일람표 출력
 * 총점계산
 */

public class ScoreServiceV5 {
	
	private int[] intKor;
	public ScoreServiceV5(){
		intKor = new int[100];
	
	}
	public void makeScore() {
		for(int i = 0; i < intKor.length ; i++) {
			intKor[i] = (int)(Math.random() * 100) +1;
		}
		public void printScore() {
			System.out.println(Line.dLine(30));
		}
		
	}
}
