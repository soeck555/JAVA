package com.callor.arrays.service;

/*
 * private 으로 선언된 makeScore()는
 * serviceV1A 클래스 블럭({})에서만 접근(호출)할수 있다
 * local method(지역 메소드)라고 한다
 */


	


/*
 * public 으로 선언된 socreKorSum()은 이 프로젝트의 어디에서
 * 클래스의 인스턴스를 생성하고 인스턴스를 통하여 접근(호출)할수 있다
 */


public class ServiceV2 {
	/*
	 * V1 에서 Math.random() 를 사용하여 점수를 생성하는 코드를
	 * makeScore() 로 이전하고, 점수 생성이 필요한 경우
	 * makeScore() 를 호출하여 결과를 사용한다
	 * 
	 */
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

