package threadsync;

import java.util.Scanner;

class Reserve extends Thread {
	int avl_berths = 1;
	int wanted_berths;
	Scanner sc = new Scanner(System.in);
	String name;

	public Reserve(String n) {
		System.out.println("Enter number of berths for: " + n);
		wanted_berths = sc.nextInt();
		name = n;
	}

	public void run() {
		synchronized (this) {

			if (wanted_berths > 0) {
				if (avl_berths >= wanted_berths) {
					System.out.println("Berths available: " + avl_berths);
					System.out.println(wanted_berths + " alloted for " + name);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ie) {
						System.out.println(ie);
					}
					avl_berths = avl_berths - wanted_berths;
				} else {
					System.out.println("Sorry! No berths available...");
				}
			} else {
				System.out.println("Invalid choice...");
			}
			System.out.println("Avaliable berths are: " + avl_berths);
		}
	}
}

public class ThreadSafe {
	public static void main(String[] args) {
		Reserve r1 = new Reserve("First Person");
		Thread t1 = new Thread(r1);

		Reserve r2 = new Reserve("Second Person");
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}
