package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterating
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    System.exit(0);	
		Map<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("1", "sandeep");
		myMap.put("2", "pawan");
		
		Set<String> keys = myMap.keySet();

		Iterator<String> keyItr = keys.iterator();
		
		while(keyItr.hasNext()){
			System.out.println(myMap.get(keyItr.next()));
		}
		
		Set<Map.Entry<String, String>> entrySet = myMap.entrySet();
		
		Iterator<Map.Entry<String, String>> entryItr = entrySet.iterator();
		
		while(entryItr.hasNext()){
			Map.Entry<String, String> entry = entryItr.next();
			System.out.println(entry.getKey() + " and " + entry.getValue());
		}
		
		
		                        
	}

}
