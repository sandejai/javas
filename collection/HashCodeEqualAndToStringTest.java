package collection;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualAndToStringTest {
	
	String Name;
	int id;
	
	public HashCodeEqualAndToStringTest(){
		
	}
	public HashCodeEqualAndToStringTest(String Name,int id){
		this.Name = Name;
		this.id = id;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashCodeEqualAndToStringTest obj1 = new HashCodeEqualAndToStringTest("Obj1",1);
		
		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(new HashCodeEqualAndToStringTest().hashCode());
		
		HashCodeEqualAndToStringTest obj2 = new HashCodeEqualAndToStringTest("Obj2",2);
		HashCodeEqualAndToStringTest obj3 = new HashCodeEqualAndToStringTest("Obj3",3);
		
		//Use these object in a hashTable
		Map<Object, String> myHashTable = new HashMap<Object, String>();
		
		myHashTable.put(obj1, "1st Obj");
		myHashTable.put(obj2, "2nd Obj");
		myHashTable.put(obj3, "3rd Obj");
		
		System.out.println(myHashTable);
		System.out.println(myHashTable.get(obj1));
		
		obj2=obj1;
		
		System.out.println(myHashTable);
		System.out.println(myHashTable.get(obj2));
		
		if(obj1.equals(obj2)){
			System.out.println("Yes equal");
		}
		else{
			System.out.println("No, Not equal");
		}
		
	}
	
	public boolean equals(HashCodeEqualAndToStringTest objToCompare){
		System.out.println(this.id + " " + objToCompare.id);
		if(this.id == objToCompare.id){
			return true;
		}
		else
			return false;
	}

}
