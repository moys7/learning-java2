package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//PrintStream 객체를 부모 타입 OutputStream으로 받아보기
		//OutputStream 도 1바이트 처리 스트림이다.
		OutputStream os=ps;
		// 2byte 처리 스트림
		OutputStreamWriter osw=new OutputStreamWriter(os);
		try {
			osw.write(48148);
			osw.write(48372);
			osw.write("아니야");
			osw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
