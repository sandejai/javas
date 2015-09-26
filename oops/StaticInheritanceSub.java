package oops;

public class StaticInheritanceSub extends StaticInheritanceSuper{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticInheritanceSub sub = new StaticInheritanceSub();
		//sub.subInstanceMethod();
		StaticInheritanceSuper sup = new StaticInheritanceSub();
		sup.superStaticMethod();
	}
	
	public void subInstanceMethod(){
		int x=0;
		super.superStaticMethod();
		this.superStaticMethod();
	}
	
	public static void superStaticMethod(){
		System.out.println("In Sub STATIC");
	}

}
