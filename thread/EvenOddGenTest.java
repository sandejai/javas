package thread;

public class EvenOddGenTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NumberGenerator numGenerator = new NumberGenerator();
		
		OddGenerator oddGen = new OddGenerator(numGenerator);
		EvenGenerator evenGen = new EvenGenerator(numGenerator);
		
		oddGen.start();
		evenGen.start();
		
		Thread.yield();

	}

}
