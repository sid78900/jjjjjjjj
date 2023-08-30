package constructor;

public class Cons {
	int id;
	String name;
	
	Cons(){
		System.out.println("hi");
	}
Cons(int a, String b){
	name=b;
	id=a;
	
}
public void display() {
	System.out.println(id+"  " +name);
}
public static void main(String[] args) {
	Cons c = new Cons();
	Cons c1 = new Cons(10,"kk");
	c1.display();
}
}
