package test.main;

import java.io.File;
import java.io.FileWriter;

public class MainClass11 {
	public static void main(String[] args) {
		//문자열을 저장할 파일을 만들기 위한 File 객체
		File memoFile=new File("c:/myFolder/memo.txt");
		
		try {
			//만일 파일이 존재하지 않으면
			if(!memoFile.exists()) {
				//파일을 만들고
				memoFile.createNewFile();
			}
			//파일에 문자열을 출력할 수 있는 객체의 참조값 얻어내기
			//FileWriter pw=new FileWriter(memoFile,true);//append 모드를 투루
			FileWriter pw=new FileWriter(memoFile);
			pw.write("김구라");
			pw.flush();
			pw.close();
			System.out.println("파일에 문자를 저장했습니다.");
	    }catch(Exception e){
			e.printStackTrace();
	    }

	}
}
