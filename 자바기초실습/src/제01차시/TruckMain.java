package ��01����;


class Car{
	String carname; 
	String color="������"; 
	int velocity;
	void speedUp(){ 
		velocity += 5;
	}
	void speedDown(){ 
		velocity -= 5;
	}
	
}
class Truck extends Car {
int ton; // ����
}

public class TruckMain {
	public static void main(String[] args){
	Truck mytruck = new Truck();
	mytruck.carname = "����Ƽ��";
	mytruck.ton = 3;
	System.out.println("���� Ʈ���� " + mytruck.color + "�̴�.");
	System.out.println(mytruck.carname+"�� "+mytruck.ton +"���� ���� �� �ִ�");
    }
}
