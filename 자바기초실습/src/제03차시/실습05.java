package ��03����;

public class �ǽ�05 {
	public static void main(String[] args) 
	{
		//1���� �迭�� ��
		int a[];
		a=new int[5];
		a[0]=10; a[1]=15; a[2]=20; a[3]=23; a[4]=35;

		//2���� �迭�� ��
       int b[][]={
       				{1, 2, 3}, 
					{4, 5, 6},
					{7, 8},
              		{10,11,12},
              		{13,14}
              	 };

		System.out.println("�迭 a[]�� ũ��: " + a.length);
		System.out.println("�迭 b[][]�� ũ��: " + b.length);
		System.out.println("�迭 b[1]�� ũ��: " + b[1].length);
		System.out.println("�迭 b[2]�� ũ��: " + b[2].length);
	}
}
