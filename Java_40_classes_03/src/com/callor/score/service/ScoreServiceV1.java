package com.callor.score.service;

import com.callor.classes.Line;
import com.callor.score.domain.ScoreV2VO;

public class ScoreServiceV1 {

	protected ScoreV2VO[] scores;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {

		scores = new ScoreV2VO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}

	}

	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV1(String[] stNames) {

		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for (int i = 0; i < length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {

		for (int i = 0; i < scores.length; i++) {
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);
		}

	}

	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표V1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i].getStName() + "\t");
			System.out.println(scores[i].getIntKor() + "\t");
			System.out.println(scores[i].getIntEng() + "\t");
			System.out.println(scores[i].getIntMath() + "\t");
			System.out.println(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n",scores[i].getfAvg());
		}
		System.out.println(Line.sLine(50));
		
	}
}
