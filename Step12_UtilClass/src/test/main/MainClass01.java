package test.main;

import java.util.ArrayList;
import java.util.List;

/*
 * 자바 에서 배열은 크기르 조절할 수 없느 고정 배열이다.
 * 
 * 따라서 동적으로 item을 추가하고 삭제하고 하는 작업을 하려면 일반베열은 사용할 수 없다.
 * 
 * 그래서 해당 작업을 하려면 ArrayList객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//String 타입을 저장할 수 있는 ArrayList객체생성
		ArrayList<String> names=new ArrayList<>();
		//List<String> names=new ArrayList<>();  이렇게 받았도 된다.
		//"김구라", "해골", "원숭이" 3개의 String type 을 저장해 보세요.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//0번방의 아이템을 불러와서 item이라는 변수에 담아보세요
		String item=names.get(0);
		//1번방의 아이템을 삭제하려면?
		names.remove(1);// 1번이 삭제되면 2번이 1번으로 온다.
		//0번반에 "에이콘"을 넣고 싶으면
		names.add(0, "에이콘");//0번에 넣으면 0번에 있던 김구라는 1번으로 밀린다.그뒤에 애들도 밀린다.
		//저장된 아이템의 갯수(size)를 사이즈라느 지역 변수에 담아 보세요.
		int size=names.size();
		//저장된 모든 아이템 전체 삭제
		names.removeAll(names);
	}
}
