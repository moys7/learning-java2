package test.main;

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 *  
 *  책 27쪽에 내용이 있다.
 */

//클래스 명 시작을 소문자로해도 에러는 안나지만 관례상
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//정수 변수 선언하고 값 대입하기
		byte iByte=10;
		short iShort=10;
		int iInt=10000;
		long iLong=10;
		/*
		 * int type 변수에 byte 타입 변수에 담긴 내용을 대입한다면?
		 * 표현가능 범위가 좁은 변수에 담긴 값을 표현 가능 범위가 더 넓은 변수에 대입하는 것은 문제가 없다
		 * 따라서 에러를 발생 시키지 않는다.
		 */
		int tmp=iShort;
		
		byte temp2=(byte)iShort;
		//캐스팅 가로에 바이트 넣는거  값이10이기에 바이트에 넣을 수 있다.
		//캐스팅을 하지않으면 에러뜬다.
		
		//byte tmp2=iInt;
		//작은컵에서 큰컵으로 이동하는 건 되지만 큰컵에서 작은컵에 넣으면 넘칠수 있다.
		
		
		//실수형 변수 선언하고 값 대입하기
		float num1=10.1f;
		double num2=10.2d; //d생략 가능하다.
		double num3=10.3;//d,f 를 붙이지 않으면 double type 으로 간주됨
		
		//float type 에 있는 값을 double type에 담기
		double tmp3=num1;
		
		//casting 연산자가 필요하다.
		float tmp4=(float)num2;
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
