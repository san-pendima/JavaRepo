package functional_interfaces;

public class Application_Fun_Inter_Ex1 {
	public static void main(String[] args) {
		//Calculate cal = (x, y) -> (x + y);
		//System.out.println("Addition result of a+b is: " + cal.add(12, 4));
		
		ScientificCalc scal = (x,y) -> (x+y);
		System.out.println("Addition result of a+b is: " + scal.add(12, 4));
	}
}
