package lambdas_with_threads;

public class ThreadImplementationUsingLambda {
	public static void main(String[] args) {
		Runnable t1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(t1);
		t.setName("Lambda Thread");
		t.start();
	}
}
