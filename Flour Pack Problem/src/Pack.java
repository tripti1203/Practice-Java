import java.io.*;
public class Pack {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int goal = Integer.parseInt(br.readLine());
		int bigCount = Integer.parseInt(br.readLine());
		int smallCount = Integer.parseInt(br.readLine());
		boolean result = canPack(bigCount,smallCount,goal);
		System.out.println(result);
	}
	public static boolean canPack(int bigCount , int smallCount , int goal) {
		if(bigCount<0 || smallCount<0 || goal<0) {
			return false;
		}
		int total = (bigCount*5)+smallCount;
		if(total==goal) {
			return true;
		}
		else {
			 if(total> goal && smallCount >= goal%5) { 
				  return true;
			 }
			 
		     else if (bigCount == 0 && smallCount >= goal) {
		    	  return true;
		     }
		     
		     else { 
		    	  return false;
		     }
		}
	}
}
