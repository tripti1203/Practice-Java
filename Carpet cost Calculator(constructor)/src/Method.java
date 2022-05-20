
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Floor floor = new Floor(2.75,4.0);
		Carpet carpet = new Carpet(3.5);
		Calculator calculator = new Calculator(floor,carpet);
		System.out.println("Area = " + floor.getArea());
		System.out.println("Total cost = " + calculator.getTotalCost());
	}

}
