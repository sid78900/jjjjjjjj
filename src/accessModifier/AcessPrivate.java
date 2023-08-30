package accessModifier;

public  class AcessPrivate {
	
	private void sid() {
		System.out.println("hii");
	}
public static void main(String[] args) {
	AcessPrivate acc= new AcessPrivate();
	acc.sid(); //within class it is possible
}
	}


