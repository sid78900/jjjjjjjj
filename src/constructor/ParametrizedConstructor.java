package constructor;

public class ParametrizedConstructor {
	int id;
	String name;
	String address;
    //default constructor
	ParametrizedConstructor(){
		System.out.println("d constructor");
	}
	ParametrizedConstructor(int a, String b, String c){
		this.id=a;
		name=b;
		address=c;
	}
	public void display() {
		System.out.println(id + " " + name +" " + address);
	}
	public static void main(String[] args) {

		ParametrizedConstructor p1 = new ParametrizedConstructor();
		ParametrizedConstructor p2 = new ParametrizedConstructor(1,"sid","bgm");
		ParametrizedConstructor p3 = new ParametrizedConstructor(2,"ss","sss");
		p2.display();
		p3.display();
	}

}
