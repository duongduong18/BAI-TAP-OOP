package model;

import java.util.Scanner;

public class Phone {
	private String nhasanxuat;
	private String quocgia;
	private int giaban;
	private int namsanxuat;
static String thietbinghegoi;
	public Phone() {
	}
	// constructor mac dinh

	public Phone(String nsx, String quocgiasx, int gia, int namsx) {
		this.nhasanxuat = nsx;
		this.quocgia = quocgiasx;
		this.giaban = gia;
		this.namsanxuat = namsx;
	}

	public void info() {
		System.out.println(nhasanxuat);
		System.out.println(quocgia);
		System.out.println(giaban);
		System.out.println(namsanxuat);
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap nha san xuat");
		nhasanxuat = sc.nextLine();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("nhapquocgia");
		quocgia = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("nhap gia ban");
		giaban = sc2.nextInt();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("nhap nam sx");
		giaban = sc3.nextInt();
	}
}
