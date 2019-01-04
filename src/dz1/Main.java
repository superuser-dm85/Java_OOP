package dz1;

public class Main {
public static void main (String []args ) {
	
	Cat cat1 = new Cat("Grey",1200,2,300,10,2.4);
	Cat cat2 = new Cat("Green",200,18,234300,2,212.4);
	
	Cat cat3 = new Cat();
	cat3.setColor("White");
	cat3.setAge(12);
	cat3.setMoves(0.2);
	cat3.setEat(12000);

	
	System.out.println(cat1);
	System.out.println(cat2);
	System.out.println(cat3);
	
	cat3.voice();
	cat1.strong();
}
}
