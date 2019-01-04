package Triangle;

public class Main {
	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(3, 4, 5);
		Triangle triangle2 = new Triangle(10, 3, 8);
		Triangle triangle3 = new Triangle();
		triangle3.setA(4);
		triangle3.setB(6);
		triangle3.setC(9.9);

		System.out.println(triangle1);
		System.out.println(triangle1.square());
		System.out.println(triangle2);
		System.out.println(triangle2.square());
		System.out.println(triangle3);
		System.out.println(triangle3.square());
	}
}
