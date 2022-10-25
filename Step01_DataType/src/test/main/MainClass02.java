package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		//국어점수
		int kor=95;
		//영어점수
		int eng=100;
		
		//국어 점수와 영어점수의 평균을 구해 콘솔창 출력
		
		//float avg=(float)(kor+eng)/2.f;
		//System.out.println(avg);
		
		double avg = (kor + eng)/2f;
		System.out.println(avg);
		
		/*
		int avg=(kor+eng)/2.f;
		System.out.println(avg);
		이렇게 하면 97이 나온다 값이 97.5인데도 말이다. 
		왜냐하면 정수끼리 연산하면 결과는 정수만 나온다.
		정수와 실수가 연산하면 실수가 나온다.
		(실수가 하나라도 껴있어야한다.)
		*/
	}

}
