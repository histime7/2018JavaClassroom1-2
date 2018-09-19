package 코드업;

import java.util.Scanner;

public class 문제1093 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		int[] 배열=new int[n];
		for(int i=0; i<n; i++) {
			배열[i]=sc.nextInt();
		}

		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=배열[i];
		}
		System.out.println(sum);
	}

}
