package ���սǽ�����;

import java.util.Scanner;

public class ����11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		
		System.out.print("��(x1,y1,r1): ");
		int x1=sc.nextInt(), y1=sc.nextInt(), r1=sc.nextInt();
		sc.nextLine();
		System.out.print("��(x2,y2,r2): ");
		int x2=sc.nextInt(), y2=sc.nextInt(), r2=sc.nextInt();
		sc.close();
		
		if(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)<=Math.pow(r1+r2, 2))
			System.out.println("����: ��ħ");
		else
			System.out.println("����: ��ġ�� ����");
	}
}
