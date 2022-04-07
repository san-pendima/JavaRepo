package threadsync;

public class DaemonThreadEx extends Thread{
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		DaemonThreadEx t1 = new DaemonThreadEx();// creating thread
		DaemonThreadEx t2 = new DaemonThreadEx();
		DaemonThreadEx t3 = new DaemonThreadEx();

		t1.setDaemon(true);// now t1 is daemon thread

		t1.start();// starting threads
		t2.start();
		t3.start();
	}
}

/*
 * The sole purpose of the daemon thread is that it provides services to user
 * thread for background supporting task. If there is no user thread, why should
 * JVM keep running this thread. That is why JVM terminates the daemon thread if
 * there is no user thread.
 */