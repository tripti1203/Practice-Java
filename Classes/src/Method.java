public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleCalculator sc = new simpleCalculator();
		sc.setFirstValue(19.21);
		sc.setSecondValue(12.22);
		System.out.println(" First Value = " + sc.getFirstValue());
		System.out.println("Second Value = " + sc.getSecondValue());
		System.out.println("Addition = " + sc.getAddition());
		System.out.println("Substraction = " + sc.getSubstraction());
		System.out.println("Multiplication = " + sc.getMultiplication());
		System.out.println("Division = " + sc.getDivision());
	}
}

