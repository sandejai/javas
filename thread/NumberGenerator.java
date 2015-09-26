package thread;

public class NumberGenerator {

	boolean oddPrinted = false;

	public synchronized void printOdd(int number) {

		while (oddPrinted == true) {
			try {
				wait();

			} catch (InterruptedException e) {

			}
		}

		System.out.println("NumberGenerator.printOdd() " + number);
		oddPrinted = true;
		notifyAll();

	}

	public synchronized void printEven(int number) {
		while (oddPrinted == false) {
			try {
				wait();

			} catch (InterruptedException e) {

			}
		}

		oddPrinted = false;
		System.out.println("NumberGenerator.printEven() " + number);
		notifyAll();
	}
}