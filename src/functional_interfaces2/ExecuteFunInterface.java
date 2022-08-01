package functional_interfaces2;

public class ExecuteFunInterface {
	public static void main(String[] args) {
		System.out.println("main starts...");
		MyFInterface mfi = new MyFInterface() {

			@Override
			public int add(int x, int y) {
				return (x + y);
			}
		};

		System.out.println(mfi.add(11, 22));

		MyFInterface mfi2 = new MyFInterface() {

			@Override
			public int add(int x, int y) {
				return (x + y + 100);
			}
		};
		System.out.println(mfi2.add(11, 220));

		// Using lambda expressions
		MyFInterface mfi3 = (int x, int y) -> x + y;
		System.out.println("From lambda result is: " + mfi3.add(100, 200));

		AnotherInterface ai = (x, y) -> x * y;
		System.out.println("From Another Interace using lambda: " + (ai.add(22, 3)));

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		ReturnLength rl = (name) -> name.length();
		System.out.println("Length of the name is: " + rl.getLength("Shanmukha Sharma"));
	}
}
