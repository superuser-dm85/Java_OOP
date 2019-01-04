package dz1;

public class Cat {

	private String color;
	private double weight;
	private int age;
	private double eat;
	private int sleep;
	private double moves;
	
	public Cat(String color, double weight, int age, double eat, int sleep, double moves) {
		super();
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.eat = eat;
		this.sleep = sleep;
		this.moves = moves;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getEat() {
		return eat;
	}

	public void setEat(double eat) {
		this.eat = eat;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	public double getMoves() {
		return moves;
	}

	public void setMoves(double moves) {
		this.moves = moves;
	}

	public void voice () {
		System.out.println("meow,meow....");
	}
	
	public void strong(){
		double strong = weight/moves;
		System.out.println("Strong ="+strong + "Kwt");
	}
	
	
	@Override
	public String toString() {
		return "Cat [color=" + color + ", weight=" + weight +" gramm" + ", age=" + age + " year" +", eat=" + eat + " gramm" + ", sleep=" + sleep 
				+ " hour" + ", moves=" + moves + " km " + "]";
	}
	}
