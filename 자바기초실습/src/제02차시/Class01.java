package ��02����;

class Class01 {
   int i=0;
   
   Class01() {
		i+=3;
		System.out.println("��  Class01 Ŭ������ �����ڶ���.");
		System.out.println("Class01 Ŭ������ ������� ��ü�� ���� ��� ȣ�����.");
		System.out.println("�� i, �ʵ� �Ǵ� ��� ������� ����. C����� ���� ���� ������ ��������.");
		System.out.println("���� i:" + i);

		doIt();
	}
   
   void doIt() {
   		i+=5;
    	System.out.println("�� doIt() �޼ҵ����. ��� �Լ���� �θ���.");
    	System.out.println("���� �ʿ��� �� ���� �ҷ���. �������� �޷�����.");
    	System.out.println("�� i, ����� �θ��ٰ�? �ʵ� �Ǵ� ��� ������ϱ�.");
    	System.out.println("���� i:" + i);
   }
}
