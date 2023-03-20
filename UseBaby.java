package Abstraction;

public class UseBaby {
	public static void main(String[] args) {
		NewBornBaby b=new NewBornBaby();
		System.out.println(b.eat());
		b.sleep();
		System.out.println(b.play());
	}
}