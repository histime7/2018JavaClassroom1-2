package ������ȿ��������1;

public class Test2 {
	int a=1, b=2;
	static int d=11;
	
	Test2() {
		//�м�(1)
		int a = 3;
		System.out.println("a:" + a);

		//�м�(2)
		System.out.print("c:");
		for (int b = 1; b <= 5; b++) {
			int c = 4;
			System.out.print(c + " ");
			a = a + b;
		}
		System.out.println("a:" + a + ", b:" + b);
		System.out.println("c:" + c);

		//�м�(3)
		int d = 5;
		System.out.println("d:" + d);

		//�м�(4)
		int c = 6;
		if (a > 0) {
			System.out.println("c:" + c);
		}

		{
			int e = 7;
			System.out.println("e:" + " ");
		}
		System.out.println("c:" + c + ", e:" + e);
		
		//�м�(5)
		System.out.println("a:" + a + ", b:" + b + ", c:" + c + ", d:" + d + ", e:" + e);
		System.out.println("static ���� d��: " + Test2.d);
	}
}
