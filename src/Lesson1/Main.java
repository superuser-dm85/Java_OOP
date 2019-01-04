package Lesson1;

public class Main {
	public static void main (String []args) {
		
		Car carOne= new Car ("Gren",2000,1981);
		
		Car carTwo= new Car();
		
	carTwo.setColor("Red");
	carTwo.setWeight(1000);
	carTwo.setYear(2000);
		
		//carTwo.print(carOne.setColor();
		System.out.println(carOne);
		System.out.println(carTwo);
		carOne.acceleration(0);
	}
}
