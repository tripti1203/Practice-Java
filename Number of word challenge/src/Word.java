import java.io.*;
public class Word {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		printNumberInWords(number);
	}
	public static void printNumberInWords(int number) {
		switch(number) {
		case 1: if(number==0)
					System.out.println("ZERO");
					break;
		case 2: if(number==1)
					System.out.println("ONE");
					break;
		case 3: if(number==2)
					System.out.println("TWO");
					break;
		case 4: if(number==3)
					System.out.println("THREE");
					break;
		case 5: if(number==4)
					System.out.println("FOUR");
					break;
		case 6: if(number==5)
					System.out.println("FIVE");
					break;
		case 7: if(number==6)
					System.out.println("SIX");
					break;
		case 8: if(number==7)
					System.out.println("SEVEN");
					break;
		case 9: if(number==8)
					System.out.println("EIGHT");
					break;
		case 10: if(number==9)
					System.out.println("NINE");
					break;
		default : System.out.println("OTHERS");
		}
	}
}
