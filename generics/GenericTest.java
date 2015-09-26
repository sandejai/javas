package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	
	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		//strList.add(new Integer(45)); //Compile Error
		GenericTest gt = new GenericTest();
		gt.insertIntoGenList(strList);
		}
	
	public void insertIntoGenList(List genList){
		
		genList.add(new Integer(45));
		
		int x = (Integer)genList.get(0);
	}

}
