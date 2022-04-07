package static_and_dynamic_binding;

public class StaticBindingExample {
	public void sum(int a, int b) {
		System.out.println("Sum with two int param: " + (a + b));
	}

	public void sum(double a, double b) {
		System.out.println("Sum with two double param: " + (a + b));
	}

	public static void main(String[] args) {
		StaticBindingExample sbe = new StaticBindingExample();
		sbe.sum(11, 12);
		sbe.sum(23.45, 44.55);
	}
}
