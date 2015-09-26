package oops;

public class OverridingSub extends OverrindingSup{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverrindingSup sup = new OverridingSub ();
		
		sup.superMethod();

	}
	
	public void superMethod(int x){
		System.out.println("in SUB method");
	}

}
