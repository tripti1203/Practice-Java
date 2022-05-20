
public class Prime {
private int n=13;
private int count=0;
	public void Prime(){
		for(int i = 1; i<=n ;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n +" Is a Prime number...");
		}
		else {
			System.out.println(n + " Not a prime number...");
		}
	}
}

