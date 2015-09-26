package exceptions;

public class FinallyTest {

	/**
	 * @param args
	 */
	
	private final int x;
	
	public FinallyTest(){
		this.x = 4;
	}
	
	public static void main(String[] args) {
		System.out.println("FinallyTest.main()");
		FinallyTest ft = new FinallyTest();
		
		System.out.println(ft.testFianlly());
		
	/*	try{
			System.out.println(ft.testFianlly());
			
		}catch(NullPointerException e){
			System.out.println("cought gracefull");
			//e.printStackTrace();
		}
		*/
		System.out.println("cought gracefull and moving");

	}

	private int testFianlly() throws Error{
		throw new Error();
	
		/*try{
			
			throw new NullPointerException();
			
			
		}catch(NullPointerException ne){
			
			
			System.out.println("In catch:FinallyTest.testFianlly()");
		
			throw new ClassCastException();
			
		}finally{
			
			return 10;
			//System.out.println(" In Finally:FinallyTest.testFianlly()");
			//throw new ArrayIndexOutOfBoundsException();
			
			//throw new NullPointerException();
			
		}
		*/
		
	}

}
