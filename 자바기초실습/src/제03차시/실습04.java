package ��03����;

public class �ǽ�04 {

	public static void main(String[] args) {
		//if���� ��
		int n=11;
		if(n%2==0)
			System.out.println(n + 
                     "�� ¦���Դϴ�.");
		else
			System.out.println(n + 
                     "�� Ȧ���Դϴ�.");

		 //switch���� ��
        int m=7;
        switch(m) {
        case 1: case 3: case 5: case 7: 
        case 8: case 10: case 12:
       	 System.out.println(m+ "���� ������ ���� 31���Դϴ�.");
	        break;
        case 2:
   	     	System.out.println(m+ "���� ������ ���� 28���Դϴ�.");
        	break;
        default:
        	System.out.println(m+ "���� ������ ���� 30���Դϴ�.");
        }

		//for���� ��
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}

		//while���� ��
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}

		//do~while���� ��
		i=1;
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
	}
}

