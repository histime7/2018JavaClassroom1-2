package �ڵ��;

import java.util.Scanner;

public class ����1093 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		int[] �迭=new int[n];
		for(int i=0; i<n; i++) {
			�迭[i]=sc.nextInt();
		}

		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=�迭[i];
		}
		System.out.println(sum);
	}

}
