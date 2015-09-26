package string;

public class EqualTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EqualTest et1 = new EqualTest();
		EqualTest et2 = new EqualTest();
		
		if(et1.equals(et2)){
			System.out.println("they r equal");
		}
		else{
			System.out.println("No NO they are not");
		}
		if(et1==et2){
			System.out.println("they r equal");
		}
		else{
			System.out.println("No NO they are not");
		}

	}

}
