package logicals;

public class FindLargestTotal {

	int largestTotal;
	int tempLargest;

	String largestSequence = "";

	public static void main(String[] args) {
		FindLargestTotal flt = new FindLargestTotal();
		flt.getLargestTotal();

	}

	public void getLargestTotal() {

		int[] arr = { -1,5,-10,2,4,-20 };
		int arraySize = arr.length;

		for (int i = 0; i < arraySize; i++) {
			for (int j = i; j < arraySize; j++) {
				tempLargest = tempLargest + arr[j];

				if (tempLargest > largestTotal) {
					largestSequence = "";
					largestTotal = tempLargest;

					/*
					 * Got the location of starting point(i) and Endpoint(j) of
					 * the largest sequence so far so store them in the String,
					 * If we find larger than this then we can reset this string
					 */
					int k = i;
					while (k <= j) {
						largestSequence = largestSequence + "," + arr[k];
						k++;
					}
				}
			}
			
			//reset tempLargest in each iteration
			tempLargest = 0;
		}

		System.out.println("largestTotal " + largestTotal
				+ " And largestSequest : " + largestSequence);
	}

}
