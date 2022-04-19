package basic.dev;

import java.util.Scanner;

public class People {
	protected String name;
	protected int age;
	protected String diachi;
	public People(String name, int age, String diachi) {
		this.name = name;
		this.age = age;
		this.diachi = diachi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		
		return age;
	}
	public void setAge(int age) {
		if(age>=1) {
			this.age = age;
		}
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		String diachi = sc.nextLine();
		People p = new People(name, age, diachi);
		float dtb = sc.nextFloat();
	}
	
}
