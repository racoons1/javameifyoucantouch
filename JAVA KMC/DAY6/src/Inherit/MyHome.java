package Inherit;

public class MyHome {

	public static void main(String[] args) {
		SuperMan superMan = new SuperMan();
		superMan.name = "Ŭ��ũ"; //person�� �ִ� ��
		superMan.age = 100; //person
		
		superMan.speed = 100; //man
		superMan.high = 1000; //SuperMan
		
		superMan.smile();
		superMan.run();
		superMan.fly();
		

	}

}
