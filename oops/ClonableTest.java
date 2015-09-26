package oops;

public class ClonableTest extends ClonableSuper {
	int x =10;
	
	public static void main(String abc[]){
		
		ClonableTest ct1 = new ClonableTest();
		
		try{
			ct1.clone();
		}
		catch(Exception e){
			System.out.println("Exception" + e);
		}
		
	}

}
