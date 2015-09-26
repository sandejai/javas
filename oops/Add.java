package oops;

public class Add extends AddSuper{
	
	
	static String name ;
	public int age = 25;
	
	static {
		System.out.println("Static Add.enclosing_method()");
		//main(null);
	}
	
	{
		System.out.println("Non static Add.enclosing_method()");
	}

//	public Add(){
//		//super.superDuperProtectedMethod();
//		System.out.println("Constructor Add()");
//	}
	
	public Add(){
		//super(0);
		System.out.println("Constructor Add() ");
	}
	
	public Add(int x){
		
		System.out.println("constrotor Add() int x ");
	}
	
	public void superPublic(){
		System.out.println("Add.superPublic()");
		System.out.println("Add.superPublic()" + this.age);
		
		//Add superOnSub = new Add();
		
		//System.out.println("Add.superPublic()" + superOnSub.age);
	}
	
	protected int superPrivate(){
		return 0;
		
	}
/*	public void superPrivate(){
		System.out.println(" Add superPrivate");
	}*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Add.main()");
		
		AddSuper superOnSub = new Add();
		
		superOnSub.superPublic();
		//System.out.println("superOnSub.age" + superOnSub.age);
		
		//new Add(7);
		//new AddSuper();
		/*int total = 0;
		for(int i = 1; i<=99; i++){
			total = total +i;
		}*/
		
		//System.out.println("Add.main()" + total);
		//System.out.println("Add.main()" + total/9);
	}
	


}
