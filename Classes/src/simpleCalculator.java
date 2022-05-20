
public class simpleCalculator {
	private double first;
	private double second;
	public void setFirstValue(double first) {
		 this.first = first;
	}
	public void setSecondValue(double second) {
		 this.second = second;
	}
	public double getFirstValue() {
		return this.first;
	}
	public double getSecondValue() {
		return this.second;
	}
	public double getAddition() {
		getFirstValue();
		getSecondValue();
		return first+second;
	}
	public double getSubstraction() {
		getFirstValue();
		getSecondValue();
		return first-second;
	}
	public double getMultiplication() {
		getFirstValue();
		getSecondValue();
		return first*second;
	}
	public double getDivision() {
		getFirstValue();
		getSecondValue();
		return first/second;
	}
}
