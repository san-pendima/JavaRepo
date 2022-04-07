package static_and_dynamic_binding;

class Shape {
	public double draw(double a, double b) {
		System.out.println("Iam Area class...");
		return 0.0;
	}
}

class Rectangle extends Shape {
	// overriding super class draw method
	public double draw(double len, double br) {
		return len * br;
	}
}

class Square extends Shape {
	// overriding super class draw method
	public double draw(double x, double y) {
		return x * y;
	}
}

public class DynamicBindingEx {
	public static void main(String[] args) {
		// Dynamic Binding
		// Assigning Sub class object to Super class reference
		Shape obj = new Rectangle();
		System.out.println(obj.draw(10, 12));

		obj = new Square();
		System.out.println(obj.draw(5, 5));
	}
}

//After execution try to remove the draw method from the Square class and observe the output.
//You would notice that the method call will call Shape classes draw method which returns 0.0
/*
 * Static Binding (or) Compiletime Polymorphisem (or) Early binding:
 * 
 * static binding When type of the object is determined at compiled time(by the
 * compiler), it is known as static binding.
 * 
 * If there is any private, final or static method in a class, there is static
 * binding.
 * 
 * Can be achieved at the time of 'method-overloading'.
 * 
 * Dynamic binding (or) Run-time Polymorphisem (or) Late Binding
 * 
 * When type of the object is determined at run-time, it is known as dynamic
 * binding.
 * 
 * Can be achieved at the time of 'method-overriding'.
 */
