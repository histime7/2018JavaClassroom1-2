package ��03����;

public class �ǽ�03 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		a++;
		b++;
		a += 15;
		b += a;
		a -= 1;
		b *= a;
		a /= 2;
		b %= 3;
		a &= 13;
		b |= a;
		System.out.println("a=" + a + ",b=" + b);

		double c = 5.5, d = 3, e;
		e = c % d;
		System.out.println(e);

		String f1 = "��Ű�";
		String f2 = "��Ű�";
		String g1 = new String("��Ű�");
		String g2 = new String("��Ű�");
		System.out.println((f1 == f2) + "," + (g1 == g2));
		System.out.println(f1.equals(f2) + "," + g1.equals(g2));
		System.out.println(System.identityHashCode(f1) + "," + System.identityHashCode(f2) + "," + System.identityHashCode(g1) 
				+ "," + System.identityHashCode(g2));

		// ��Ʈ������: ������ 33��
		System.out.println(0b00000110 & 0b11111101);
		System.out.println(0b00000110 | 0b00001000);
		System.out.println(0b00000110 ^ 0b00001111);
		System.out.println(~0b00000110);
		System.out.println(0b00010100 >> 2);
		System.out.println(0b00010100 << 2);

		System.out.println(0b10010100 >> 2);
		System.out.println(0b10010100 >>> 2);

		System.out.printf("%d, %d", 0b1 << 31, (0b1 << 31) - 1);

		// ���ǿ�����(���׿�����): ������ 34��
		a = 2;
		b = 3;
		System.out.println("ū ��: \n" + (a > b ? a : b));

		int o, p, q;
		o = 2;
		p = 10;
		q = 15;
		System.out.println("�ִ밪: " + (o > p && o > q ? o : (p > o && o > q ? p : q)));

	}
}
