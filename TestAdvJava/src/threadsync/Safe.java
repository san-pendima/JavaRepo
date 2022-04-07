package threadsync;

class Reserve1 extends Thread {
	// available berths are 1

	int available = 1;
	int wanted;

	// accept wanted berths at run time
	Reserve1(int i) {
		wanted = i;
	}

	public void run() {
		synchronized (this) {
			// display available berths
			System.out.println("Available Berths = " + available);

			// if available berths are more than wanted berths
			if (available >= wanted) {
				String name = Thread.currentThread().getName();

				// allot the berth to him
				System.out.println(wanted + " Berths reserved for " + name);
				try {
					Thread.sleep(1500);
					available = available - wanted;
					// update the no of available berths
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} // if available berths are less, display sorry
			else {
				System.out.println("Sorry, no berths");
			}
			// end of synchronized block
		}
	}

}

class Safe {

	static public void main(String args[]) {
		// tell that 1 berth is needed
		Reserve1 obj = new Reserve1(1);

		// attach first thread to the object
		Thread t1 = new Thread(obj);
		// attach second thread to the same object
		Thread t2 = new Thread(obj);

		// take the thread names as persons names
		t1.setName("First person");
		t2.setName("Second person");

		// send the requests for berth
		t1.start();
		t2.start();
	}
}
