package dz8;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		Group PN121 = new Group();
		PN121.addHuman("Dmitiy", 33, 'м');
		PN121.addHuman("Arina", 1, 'ж');
		PN121.addHuman("Irina", 33, 'ж');
		PN121.addHuman("Max", 5, 'м');
		
		
		Group FSU101 = new Group();
		FSU101.addHuman("Dm", 33, 'м');
		FSU101.addHuman("Ar", 1, 'ж');
		FSU101.addHuman("Irina", 33, 'ж');
		FSU101.addHuman("Max", 5, 'м');
		
		
		System.out.println();
		System.out.println("Вывод данных исходного объекта");
		System.out.println();
		PN121.printgroup();
		
		try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("fil"))) {
			OOS.writeObject(PN121);
		} catch (IOException e) {
			System.out.println("ERROR save group !!!");
			
			
		}
		try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("fil"))) {
			OOS.writeObject(FSU101);
		} catch (IOException e) {
			System.out.println("ERROR save group !!!");
		}
		
		Group KT321 = null;
		
		try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("fil"))) {
			KT321 = (Group) OIS.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("ERROR load group !!!");
		}
		System.out.println();
		System.out.println("Вывод данных считанного объекта");
		System.out.println();
		KT321.printgroup();
	}
}