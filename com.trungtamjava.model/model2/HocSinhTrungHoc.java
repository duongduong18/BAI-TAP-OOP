package model2;

public class HocSinhTrungHoc {

	private String ten;
	private String quequan;
	private int chieucao;
	private int cannang;
	private int idc;
	private double diemphay;

//constructor
	public HocSinhTrungHoc(String ten, String adress, int cao, int nang, int id, double diemphay) {
		this.ten = ten;
		this.quequan = adress;
		this.chieucao = cao;
		this.cannang = nang;
		this.idc = id;
		this.diemphay = diemphay;
	}

	public void info() {
		System.out.println("ten:" + ten);

		System.out.println("que quan:" + quequan);

		System.out.println("chieucao:" + chieucao + "cm");

		System.out.println("can nang:" + cannang + "kg");

		System.out.println("id:" + idc);
		if (diemphay >= 5 && diemphay < 7) {
			System.out.println("hoc sinh trung binh");
		}
		if (diemphay >= 7 && diemphay < 8) {
			System.out.println("hoc sinh kha");
		}
		if (diemphay >= 8 && diemphay < 9) {
			System.out.println("hoc sinh gioi");

		}
	}
}
