package Abstraction;

public abstract class Baby implements Human {
	public String eat() {
		return "baby eats around 8 times a day";
	}
	public void sleep() {
		System.out.println("baby sleeps arounf 14 hours a day");
	}
	public abstract String play();
}