
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wall wall1 = new Wall("East",10);
		Wall wall2 = new Wall("West",10);
		Wall wall3 = new Wall("North",10);
		Wall wall4 = new Wall("South",10);
		
		Bed bed = new Bed("Brown",3,8,4);
		
		Fan fan = new Fan(" Black");
		Bedroom bedroom = new Bedroom(wall1,wall2,wall3,wall4,bed,fan);
		bedroom.getBed().turnOn();
		
	}

}
