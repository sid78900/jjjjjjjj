package arrayLIst_HashMap;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String>  hm = new HashMap<Integer,String>();
		
		hm.put(1, "sid");
		hm.put(2, "abhi");
		hm.put(3, "acv");
		  
		System.out.println(hm.get(1));
		
		for(Map.Entry  m:hm.entrySet()) {
			System.out.println(m.getKey() + "      " + m.getValue());
		}

	}

}
