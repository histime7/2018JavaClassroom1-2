package study11;


import java.awt.*;
class exFrame extends Frame
{
	private Button b=new Button("¿¬½À");
	public exFrame() {
		this.setLayout(new FlowLayout());
		this.add(b);
	}
}
class  FirstAwt
{
	public static void main(String[] args) 
	{
		Frame f=new exFrame();
		f.setSize(500,500);
		f.setBackground(new Color(255,0,0));
		f.show();		
	}
}