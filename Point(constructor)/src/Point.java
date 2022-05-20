
public class Point {
private int x;
private int y;
	Point(){
		System.out.println("Empty Constructor.....");
	}
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}
	public double distance(int dx , int dy) {
		dx+=x;
		dy+=y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	public double distance(Point other) {
		int xx = other.x-x;
		int yy = other.y-y;
		return Math.sqrt(xx*xx + yy*yy);
	}
}
