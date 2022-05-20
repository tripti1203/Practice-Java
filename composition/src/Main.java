import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size=5;
        int sales[]= new int[size];
        int i=0;

        for(i=0;i<size;i++){
            System.out.print("Enter the sales made by " + (i+1) + ":");
            sales[i]=scanner.nextInt();
        }
        for(i=0;i<size;i++){
            System.out.println("Sales[" + (i+1) + "] =" + sales[i]);
        }
    }
}
