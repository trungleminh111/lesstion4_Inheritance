package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		People persons[] = new People[5];
		Scanner sc = new Scanner(System.in);
		int flag;
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Ban muon nhap sinh vien (0) | giao vien (1)");
			flag = sc.nextInt();
			sc.nextLine();
			if(flag == 0) {
				//Nhap sinh vien
				System.out.println("Nhap ten sinh vien");
				String name = sc.nextLine();
				
				System.out.println("Nhap tuoi sinh vien");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Nhap dia chi sinh vien");
				String diaChi = sc.nextLine();
				
				System.out.println("Nhap diem trung binh sinh vien");
				float dtb = sc.nextFloat();
				sc.nextLine();
				
				persons[i] = new SinhVien(name, age, diaChi, dtb);
			}else {
				//Nhap giao vien
				System.out.println("Nhap ten giao vien");
				String name = sc.nextLine();
				
				System.out.println("Nhap tuoi giao vien");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Nhap dia chi giao vien");
				String diaChi = sc.nextLine();
				
				System.out.println("Nhap he so luong giao vien");
				float hsl = sc.nextFloat();
				sc.nextLine();
				
				persons[i] = new SinhVien(name, age, diaChi, hsl);
			}
		}
		
		print(persons);
	}

	static void print(People persons[]) {
		for (int i = 0; i < persons.length; i++) {
			
		}
	}
	
	}

