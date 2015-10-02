package mathematics;

public class LargestPalindromeSimple {

	public static void main(String[] args) {
		
		String inputStr= "bnnbaaaaa";

		new LargestPalindromeSimple().findLargestPalinInString(inputStr);
	}

	public void findLargestPalinInString(String inputStr) {
		String largestPalim = "";
		int largestPalinLenght = 0;
		for(int i=0 ; i<= inputStr.length()-1 ; i++) {
			for(int j=i+1; j<= inputStr.length()-1; j++) {
				System.out.println("i= " + i +" ,j= " + j);
				String subStr = inputStr.substring(i, j+1);
				if(isPalindrome(subStr)) {
					if(subStr.length()>largestPalinLenght) {
						largestPalim = subStr;
						largestPalinLenght = subStr.length();
					}
				}
			}
		}
		System.out.println("largestPalim : " + largestPalim + " largestPalinLenght = " + largestPalinLenght );
	}

	private boolean isPalindrome(String subStr) {
		boolean isPalin = false;
		String reversStr = reversString(subStr);
		if(subStr.equals(reversStr)) {
			System.out.println("Yes, Its palindrome: " +subStr );
			isPalin = true;
		}
		return isPalin;
	}

	private String reversString(String subStr) {
		StringBuilder reversedStr = new StringBuilder();
		for(int i= subStr.length()-1 ; i>= 0; i--) {
			reversedStr.append(subStr.charAt(i));
		}
		return reversedStr.toString();
	}
}
