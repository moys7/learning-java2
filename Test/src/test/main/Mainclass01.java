package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mainclass01{
	public static void main(String[] args) {
		Map<String, String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("입력");
			String a=scan.nextLine();
			
			if(dic.get(a)==null) {
				System.out.println(a+"는 사전에 등록되지 않았어요");
			}else {
				System.out.println(a+"의 뜻은 "+dic.get(a)+"에요");
			}
		}
	}
}
