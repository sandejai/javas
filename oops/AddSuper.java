package oops;

public class AddSuper extends AddSpuerDuper{
	
	private int age = 26;
	

	static{
		System.out.println("Static AddSuper.enclosing_method()");
	}
	
	{
		System.out.println("Non static AddSuper.enclosing_method()");
	}
	
	public AddSuper(){
		System.out.println("Constructor AddSuper()");
		int x = 9;
		//super.superDuperProtectedMethod();
		
	}
	
	public AddSuper(int x ){
		System.out.println("Constructor AddSuper() int x ");
		
	}
	
	private void superPrivate(){
		
	}
	
	public void superPublic(){
		
		System.out.println("sandeep AddSuper.superPublic()");
		
	}
}
