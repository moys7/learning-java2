package test.main;
/*
 * 6. 3항 연산자 테스트
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=false;
		//isWait 이 ture면 "기다려요"가 대입된다. false면 "기다리지 않아요"가 대입
		String result = isWait ? "기다려요" : "기다리지 않아요";
		
		System.out.println(result);
		
		//위에 3항 연산자는 아래와 같이 if~else 문과 같은 로직이다.
		String result2=null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
	}
}
// 책 86부터 120  연산자 관련 내용 나옴
