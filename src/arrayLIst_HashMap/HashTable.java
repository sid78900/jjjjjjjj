package arrayLIst_HashMap;

import java.util.Hashtable;

import com.google.common.collect.Table;

public class HashTable {

	public static void main(String[] args) {
	Hashtable<Integer, String> tb = new Hashtable<>();
	tb.put(1, "SID");
	tb.put(2, "SJE");
	tb.put(3, "SHF");
//tb.remove(1);
	
	for(Integer key : tb.keySet()) {
		System.out.println(key + "  "  + tb.get(key));
	}
	}

}
