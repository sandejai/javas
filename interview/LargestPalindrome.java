package interview;

public class LargestPalindrome {

	/**
	 * The logic is pretty simple. Start from 2nd char and take it as pivot.
	 * Check if its previous char and next char are equal.
	 * If so you found the first smallest "Palindrome"(3 char).
	 * 
	 * Now keep in while loop --previousIndex and ++NextIndex and keep checking the same.
	 * If PrevChar == Next Char.
	 * 
	 * and finally if at all any palindrome found do a check for largest.
	 */
	public static void main(String[] args) {

		String puzzleString = "abshsbsbabcba";
		LargestPalindrome palindromeObj = new LargestPalindrome();
		
		System.out.println("Largest palindrome in " + puzzleString + " is " 
				+ palindromeObj.getLargestPalindrome(puzzleString));
	}
	
	public String getLargestPalindrome(String puzzleString){
		
		String largestPalindrome = "";
		String newLargestPalindrome;
		int size = puzzleString.length();
		int pivot;
		int sizeOfLargestPalindrome = 0;
		int newSizeOfLargestPalindrome;
		boolean found = false;
		
		for(pivot = 1; pivot<size-1; pivot++){
			int previousIndex = pivot - 1;
			int nextIndex = pivot + 1;
			
			char previousChar = puzzleString.charAt(previousIndex);
			char nextChar = puzzleString.charAt(nextIndex);
			
			while(previousChar == nextChar){
				found = true;
				
				previousIndex--;
				nextIndex++;
				if((previousIndex>=0) && (nextIndex<size)){
					previousChar = puzzleString.charAt(previousIndex);
					nextChar = puzzleString.charAt(nextIndex);
					continue;
				}
				else 
					break;
			}
			
			if(found){
				newLargestPalindrome = puzzleString.substring(++previousIndex, nextIndex);
				newSizeOfLargestPalindrome = newLargestPalindrome.length();
				
				if(newSizeOfLargestPalindrome >= sizeOfLargestPalindrome){
					largestPalindrome = newLargestPalindrome;
					sizeOfLargestPalindrome = newSizeOfLargestPalindrome;
					System.out.println("newSizeOfLargestPalindrome= "+newSizeOfLargestPalindrome
							+ "  sizeOfLargestPalindrome= "+ sizeOfLargestPalindrome);
					
					System.out.println("found " + largestPalindrome);	
				}
			}
		}
		return largestPalindrome;
	}

}
