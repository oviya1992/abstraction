package Abstraction;

public class UseSmartPhone {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.call();
		System.out.println(s.video());
		System.out.println(s.sms());
		
	}

}
