package mathematics;

public class ReverseStringRecursive {

	public static void main(String[] args) {
		
		new ReverseStringRecursive().reverseString("abcdefg");;

	}

	public void reverseString(String inputStr) {
		
		int rightIndex = inputStr.length()-1;
		int leftIndext = 0;
		char [] reverseStr = new char[inputStr.length()];
		
		getReverse(inputStr,leftIndext,rightIndex,reverseStr);
		System.out.println(" inputStr : " +  inputStr + ", Reversed " + new String(reverseStr).toString());
	}

	private void getReverse(String inputStr, int leftIndext, int rightIndex,char []  reverseStr) {	
		if(leftIndext <= rightIndex) {
			reverseStr[leftIndext] = inputStr.charAt(rightIndex);
			reverseStr[rightIndex] =inputStr.charAt(leftIndext);
			leftIndext++;
			rightIndex--;
			getReverse(inputStr, leftIndext, rightIndex, reverseStr);			
		}
	}
}
