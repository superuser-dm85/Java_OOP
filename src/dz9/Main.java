package dz9;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.print(list);
		System.out.println();

		list.remove(0);
		list.remove(0);
		list.remove(list.size() - 1);
		System.out.print(list);

	}
}
/*
 * Написать метод, который создаст список, положит в него 10 элементов, затем
 * удалит первые два и последний, а затем выведет результат на экран.
 * 
 */

// Operation<Double, BigInteger> op = new Operation<>(34.5, new
// BigInteger("345"));
// System.out.println(op.sum());