package ��04����;

import java.io.IOException;

public class �ǽ�02 {
	public static void main(String[] args) {
		int bt;
		try {
			while((bt=System.in.read())!=-1) {
				System.out.print((char)bt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
