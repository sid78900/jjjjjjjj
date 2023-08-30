package accessModifier;

public class AcessPrivate2 extends AcessPrivate {

	public static void main(String[] args) {
		AcessPrivate2 accc = new AcessPrivate2();
		accc.sid();//method is private it can not access to another class
	}

}
