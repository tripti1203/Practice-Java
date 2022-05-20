import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y:");
        int y = scanner.nextInt();
        {
            if (x > y) {
                System.out.println("x value " + x + " is greater than" + " value of y " + y);
            } else if (x < y) {
                System.out.println("x value " + x + " is less than" + " value of y " + y);
            } else {
                System.out.println("x value " + x + " is equal to the" + " value of y " + y);
            }
        }
        int difference= x-y;
        System.out.println("Difference obtained is : "+ difference);
    }
}
