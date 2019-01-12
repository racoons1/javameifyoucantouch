package Inherit;

public class SuperMan extends Man{
	//정적특징 상속받은거(3개임) - high
	int high;
	
	//동적특징 상속받은거(3개임) - fly
	public void fly() {
		run();
		System.out.println("날다.");
	}

}
