package oops;
import accessModifier.AcessProtected;
public class AcessProtected2 extends AcessProtected{

	public static void main(String[] args) {
		AcessProtected2 a2 = new AcessProtected2();//ACESS PROTECTED ONLY ACCES BY DIFFERENT PACKAGE CHILD CLASS OBJECT
		a2.m1();
		AcessProtected a3= new AcessProtected();
		a3.m1();
		AcessProtected a4 = new AcessProtected2();
		a3.m1();
		
	}

}
