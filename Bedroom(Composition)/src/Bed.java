
public class Bed {
private String color;
private int height;
private int width;
private int pillows;
	Bed(String color , int height , int width , int pillows){
		this.color = color;
		this.height = height;
		this.pillows = pillows;
		this.width = width;
	}
	public void turnOn() {
		System.out.println("FAN is on....");
	}
	public String getColor() {
		return color;
	}
	public int getheight() {
		return height;
	}
	public int getwidth() {
		return width;
	}
	public int getPillows() {
		return pillows;
	}
}
