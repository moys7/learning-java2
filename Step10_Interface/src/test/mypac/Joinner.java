package test.mypac;


@FunctionalInterface
//@Fun 플러스 컨트롤 스페이스 추상메소드를 1개만 만들도록 강제하는 역할
//(()->{}형태로 사용할 수 있도록 보장)
public interface Joinner {
	public String join(String one, String two);
}