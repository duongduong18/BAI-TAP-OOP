package model2;

public class HamMainHocSinh {

	public static void main(String[] args) {
		HocSinhTrungHoc bang = new HocSinhTrungHoc("Tuan", "Sai Gon", 176, 76, 1234, 8.5);
		bang.info();
		System.out.println("---------------------");
		HocSinhTrungHoc bang2 = new HocSinhTrungHoc("Duong", "Ha Noi", 180, 80, 5678, 6.5);
		bang2.info();
		System.out.println("---------------------");
		HocSinhTrungHoc bang3 = new HocSinhTrungHoc("Nam", "Da Nang", 178, 66, 9876, 7);
		bang3.info();
	}
}