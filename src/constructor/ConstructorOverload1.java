package constructor;

public class ConstructorOverload1 {

	ConstructorOverload1(){
		System.out.println("no arg constructor");
	}
	ConstructorOverload1(int a){
		System.out.println("int arg constructor");
	}
	ConstructorOverload1(String b){
		System.out.println("string arg constructor");
	}
	public static void main(String[] args) {
		ConstructorOverload1 c1 = new ConstructorOverload1();
		ConstructorOverload1 c2 = new ConstructorOverload1(1);
		ConstructorOverload1 c3 = new ConstructorOverload1("selenium");
	}

}
