package oops;

public class ClonableSuper implements Cloneable{

	
	String name = "KAKAJI";
	int age = 26;
	public static void main(String abc[]){
		
		ClonableSuper ct1 = new ClonableSuper();
		try{
			ClonableSuper ct2 = (ClonableSuper)ct1.clone();
			
			System.out.println(ct2.name);
			
			ct1.name= "BABAJI";
			
			System.out.println(ct2.name);
		}
		catch(Exception e){
			System.out.println("Exception" + e);
		}
	}
	/*
	public Object clone(){
		
	}
	*/
}
