package ������ȿ����1;

public class Test2 {
	int a=1, b=2, c=3;
	
	Test2() {
		//�м�(1)
		int a = 4;
		System.out.println("a:" + a);

		//�м�(2)
		System.out.print("c:");
		for (int b = 1; b <= 5; b++) {
			int c = 5;
			System.out.print(c + " ");
			a = a + b;
		}
		System.out.println("a:" + a + ", b:" + b);
		System.out.println("c:" + c);

		//�м�(3)
		int b = 6;
		System.out.println("b:" + b);

		//�м�(4)
		if (c > 4) {
			int d = 7;
			System.out.println("d:" + d);
		}
		System.out.println("d:" + d);
		
		//�м�(5)
		method1(8);
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
	}
	
	void method1(int a) {
		int b=9;
		System.out.println("a:" + a + ", b:" + b + ", c:" + c);
	}
}
