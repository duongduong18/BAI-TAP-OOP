package model;

public class HamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone = new Phone();
		Phone samsung = new Phone();
		Phone xiaomi = new Phone();

		iphone.input();
		samsung.input();
		xiaomi.input();

		iphone.info();
		samsung.info();
		xiaomi.info();

	}
}
