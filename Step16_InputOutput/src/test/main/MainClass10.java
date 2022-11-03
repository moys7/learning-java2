package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		File f1=new File("c:/myFolder/folder1");
		//폴더만들기
		f1.mkdir();
		
		//폴더1000개 만들기
		for(int i=0; i<1000; i++) {
			File tmp=new File("c:/myFolder/folder1"+i);
			//tmp.mkdir();//폴더 생성
			tmp.delete(); //폴더 삭제하기
		}
			
	}
}
