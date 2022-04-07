package threadsync;

class Table11 {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread22 extends Thread {
	Table11 t;

	MyThread22(Table11 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread33 extends Thread {
	Table11 t;

	MyThread33(Table11 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

// using synchronized method
public class SyncTest2 {
	public static void main(String args[]) {
		Table11 obj = new Table11();// only one object
		MyThread22 t1 = new MyThread22(obj);
		MyThread33 t2 = new MyThread33(obj);
		t1.start();
		t2.start();
	}
}
