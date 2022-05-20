
public class Table {
private int i=0;
private int j=0;
private int mul=0;
	public Table() {
		for(i=1;i<10;i++) 
			for(j=1;j<=10;j++) 
				mul = i*j;
	 }
	public void getTable() {
		for(i=1;i<10;i++) 
			for(j=1;j<=10;j++) 
				System.out.println(i + " X " + j + " = " + mul);
	}
}


