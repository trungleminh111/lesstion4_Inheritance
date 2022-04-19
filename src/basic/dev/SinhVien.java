package basic.dev;

import java.util.Scanner;

public class SinhVien extends People {

	public SinhVien(String name, int age, String diachi) {
		super(name, age, diachi);
		// TODO Auto-generated constructor stub
	}
	private float dtb;
	public SinhVien(String name, int age, String diachi, float dtb) {
		super(name, age, diachi);
		this.dtb = dtb;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao dtb");
		float dtb = sc.nextFloat();
	}

	
	}


		
