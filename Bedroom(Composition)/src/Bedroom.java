
public class Bedroom {
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Bed bed;
	private Fan fan;
	
	Bedroom(Wall wall1 , Wall wall2 , Wall wall3 , Wall wall4, Bed bed , Fan fan){
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.bed = bed;
		this.fan = fan;
	}
	public Wall getWall1() {
		return wall1;
	}
	public Wall getWall2() {
		return wall2;
	}
	public Wall getWall3() {
		return wall3;
	}
	public Wall getWall4() {
		return wall4;
	}
	public Bed getBed() {
		return bed;
	}
	public Fan getFan() {
		return fan;
	}
}
