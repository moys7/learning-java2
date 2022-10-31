package test.main;

import java.util.HashMap;

//순서 상관없을떄hashmap

/*
 * java에서
 */
public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 번호:1
		 * 이름: 김구라
		 * 남자인지 여부:true 
		 */
		HashMap<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("isMan", true);
		
		/*
		 * value의 Generic 클래스가 Object로 지정되어 있기 떄문에
		 * 이턴되는 object 타입을 원래 타입으로 캐스팅해야한다.
		 */
		int num = (int)map1.get("num");
		//object 타입을 사용하면 저장할 때는 편하다 다만 꺼낼때는 캐스팅을 해야하는 불편함이 있다.
		String name=(String)map1.get("name");
		boolean isMan=(boolean)map1.get("isMan");
		
		//동일한 key값으로 다시 담으면 수정
		map1.put("name", "에이콘");
		
		//특정 key 값으로 담긴 내용삭제, 성공하면 true, 실패하면 false 리턴
		map1.remove("isMan");
		
		//모두 삭제
		map1.clear();
	}
}
