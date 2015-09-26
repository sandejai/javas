package oops;

public class AddSpuerDuper {
	static{
		System.out.println("Static AddSpuerDuper.enclosing_method()");
	}
	
	{
		System.out.println("Non static AddSuprDuper.enclosing_method()");
	}
	
	public AddSpuerDuper(){
		System.out.println("Constructor AddSpuerDuper()");
	}
	
	public AddSpuerDuper(int x){
		System.out.println("Constructor AddSpuerDuper() int x");
	}
	
	protected void superDuperProtectedMethod(){
		
	}

}
