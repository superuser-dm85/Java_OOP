package dz6;

public class Main {
	public static void main(String[] args) {

		// �������� ��� �������, ������� ����� ��������� ���������
		// �����, ������� ������ ����� ������, � �������� ��������� ��
		// �����
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		try {
			t.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("main thread break");
		}
		System.out.println("Stop programm");
	}
}