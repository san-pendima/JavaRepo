package functional_interfaces;

/*
 * An interface with only one abstract method is called as functional-interface
 * We can write any abstract methods in an interface,but 
 * 	we can write lambda expressions only for functional-interfaces.
 */

@FunctionalInterface
public interface Calculate {
	public int add(int x, int y);
	//public int sum(int x, int y);
}
