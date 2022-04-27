package controller;

public class ControlleV2 {
	public static void main(String[] args) {
		
		// if(비교연산식) { }
		// for( ;; ){ }
		int intNum = 1;
		/*
		 * for()반복문을 아무런 조건없이 실행하여
		 * {}내부의 코드를 무한 반복하기
		 * for (;??;) 반복문의 두번째 명령문은 비교문이 들어간다
		 * 이때부터 for()
		 */
		for(;intNum<10;) {
		System.out.printf("\t%d x %d = %d\n",3,intNum , 3 *intNum ++);
		
		if(intNum>9) {
			System.out.println("10 넘어감");
			/*
			 * fot () 반복문 내에서 break 명령이 실행되면
			 * 즉시 반복을 멈춘다
			 */
			break;
		}
	}
}
		
}
