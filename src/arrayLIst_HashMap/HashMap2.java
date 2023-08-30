package arrayLIst_HashMap;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

import com.thoughtworks.selenium.webdriven.commands.GetValue;

public class HashMap2 {

	public static void main(String[] args) {
	HashedMap<Integer, String> hm = new HashedMap<>()
;		hm.put(1, "SID");
		hm.put(2, "SJE");
		hm.put(3, "SHF");
		
	System.out.println(hm.get(1));
	//nested interface
	for(Map.Entry m : hm.entrySet()) {
		System.out.println(m.getKey()+"  "+m.getValue());
		
	}
		}

}
