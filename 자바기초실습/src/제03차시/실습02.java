package ��03����;

public class �ǽ�02 {
	public static void main(String[] args) {
		String a = "��Ű�";

		String b[] = { "��õ", "����", "���̽��Ͱ�" };

		String c[] = new String[3];
		c[0] = "��õ";
		c[1] = "����";
		c[2] = "���̽��Ͱ�";

		System.out.println(a.hashCode() + ":" + a);
		System.out.println(b.hashCode() + ":" + b[0] + b[1] + b[2]);
		System.out.println(c.hashCode() + ":" + c[0] + c[1] + c[2]);
	}
}
