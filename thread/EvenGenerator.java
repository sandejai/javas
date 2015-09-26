package thread;

public class EvenGenerator extends Thread {

	public NumberGenerator numGen;

	public EvenGenerator(NumberGenerator numberGen) {
		this.numGen = numberGen;
	}

	public void run() {
		int i = 2;
		while (i <= 10) {
			numGen.printEven(i);
			i = i + 2;
		}

	}

}
