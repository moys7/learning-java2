package test.mypac;

public class Rect {
	//폭과 높이에 대한 필드2개
	public int w;
	public int h;
	//메소드
	public void showArea() {
		//필드에 있는 값을 활용해서 면적을 계산한다
		System.out.println(this.w*this.h);
		int area=this.w * this.h;
		System.out.println("면적은"+area+"입니다.");
		//this는 생략이 가능하지만 배우는 단계임으로 나두겠다.
	}
}
