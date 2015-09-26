package oops;

class TestCons
{
	public static void main(String args[])
	{
		A a = new A();
		a.print();
		C c = new C(5);
		
		
	}
}

class A
{
	public A()
	{
		System.out.println("inside A()");
	}
	
	  void print()
	{
		System.out.println("inside print of A");
	}
}

class B 
{
	public B(int n)
	{
		System.out.println("inside B()");
	}
}

class C 
{
	public C(int n)
	{
		
		System.out.println("inside C()");
	}
}