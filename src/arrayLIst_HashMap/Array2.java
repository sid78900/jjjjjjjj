package arrayLIst_HashMap;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		System.out.println("no of elements" +  "-"+ al.size());
		al.add("siddd");
		al.add(1223);
		al.add(10.545);
		
		System.out.println("after adding" + "-"+ al.size());
		System.out.println("elements in arrayList :"  + al);
		
	//inserting elements
		al.add(1,"sid");
		System.out.println("after inserting :"  + al);
		al.remove("siddd");
		System.out.println("after removing " + al);
		}

}
