package 변수유효범위2;

public class Test2 {
	int a=1;
	static int b=30;
	
	Test2() {
	}
	
	void print() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}