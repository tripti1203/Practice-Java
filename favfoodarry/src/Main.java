import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you five favorite food");
        String[] food= new String[3];
        for(i=0;i<food.length;i++){
            System.out.print("food "+(i+1)+":");
            food[i]= scanner.nextLine();
        }
        System.out.println("No more memory Available");
        System.out.println("your favorite food is: ");
        for(i=0;i<food.length;i++){
            System.out.println(food[i]);
        }
    }
}
