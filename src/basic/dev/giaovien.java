package basic.dev;

public class giaovien extends People {
	private float hsl;

	public giaovien(String name, int age, String diachi, float hsl) {
		super(name, age, diachi);
		this.hsl = hsl;
	}

	public float getHsl() {
		return hsl;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}
}
