package test.main;

public class MainCass01 {
	public static void main(String[] args) {
		//int type 5개를 저장하고 있는 배열객를 생성해서 참조값을 nums이라는 지역변수에 담기
		int[] nums={10, 20, 30, 40, 50};
		//int는 숫자 하나만 들어달때 사용 따라서 int[]를 넣어줌.
		//디버깅을 하면참조값이 nums에 들어가는 것을 볼 수 있다.
		
		//double type 5개를 저장하고 있는배열
		double[] num2= {10.1, 10.2, 10.3, 10.4, 10.5};
		//boolean type 5개를 저장하고 있는 배열
		boolean[] truth= {true, false, false, true, true};
		//String type (참조데이터 type)5개를 저장하고 있는 배열
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		
		
		//배열의 각각의 방 참조하기
		int result1=nums[0]; //10
		double result2=num2[1];//10.2
		boolean result3=truth[2];//false
		String result4=names[3];//"주뎅이"
		
		//배열 객체의 메소드와 필드 사용해보기
		int[] cloned=nums.clone();
		//배열의 복제본을 만들어내기 clone, 내용은 같지만 다른 참조값이 만들어진다. 
		int[] copied=nums;
		//대입연산자를 사용할 경우 참조값이 같다.
		int size=nums.length;// 값5
		//length라는 필드에는 배열의 사이즈가 들어있다.
	}
}
