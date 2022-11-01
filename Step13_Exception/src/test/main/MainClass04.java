package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		
	/*
	 * 현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어 할 수 있는 File객체를 생성해서
	 * 참조값을 f 라는 지역변수에 담기
	 */
		File f=new File("C:/Users/user01/Desktop/개발자야/수업자료/java/myFolder/memo.txt");
		
		//실제 메모 텍스트 파일이 존재하지 않으면 파일을 만들고
		//존대하면 메모 파일을 삭제하도록 프로그래밍 해보세요.
		try {
			if(!f.exists()) {
			f.createNewFile();
			}else {
				f.delete();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
