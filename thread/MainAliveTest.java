package thread;

public class MainAliveTest extends Thread {

	public  Thread t;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainAliveTest main = new MainAliveTest();
		main.setMainThread(Thread.currentThread());

		main.start();
		System.out.println("MainAliveTest.main()");

	}

	private  void setMainThread(Thread currentThread) {
		System.out.println("MainAliveTest.setMainThread()" + currentThread.getName() );
		this.t = currentThread;
	}

	public void run() {

		while (true) {
			System.out
					.println("MainAliveTest.run() t.isAlive() " + t.isAlive());
			try {
				sleep(5000);
			} catch (InterruptedException ie) {

			}

		}

	}

}
