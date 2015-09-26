package oops;

import java.util.ArrayList;
import java.util.List;


public class CallByValueReference {

	/**
	 *  In Java Every thig is call by Value.
	 *  For Object the value of reference stored in STACK is passed
	 *  For Primitive the value itself is passed
	 */
	public static void main(String[] args) {
	
		List<String> strList = new ArrayList<String>();
		
		strList.add("sandeep1");
		
		/*
		 * Here passing the ref of strList, So any changes don will reflect here
		 */
		new CallByValueReference().testCallBymethod(strList);

		System.out.println("strList= " +strList);

		
	}
	
	public void testCallBymethod(List<String> localList){
		
		System.out.println("localList= " +localList);
		localList.add("sandeep2");
		
	}

}
