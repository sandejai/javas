package thread;

public class OddGenerator extends Thread {

	public NumberGenerator numGen;

	public OddGenerator(NumberGenerator numberGen) {
		this.numGen = numberGen;
	}

	public void run() {
		int i = 1;
		while (i <= 9) {

			numGen.printOdd(i);
			i = i + 2;
		}
	}

}
