import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0,j=0;
        int size=5,month=12;
        int total=0;

        int sales[][]= new int[size][month];
        for(i=0;i<size;i++){
            System.out.println("Enter the sales made by salesman" + (i+1) + ":");
            for(j=0;j<month;j++){
                System.out.print("Month " + (j+1) + ":");
                sales[i][j]= scanner.nextInt();
                total+=sales[i][j];
            }
            System.out.println("Total sales made by salesman" + (i+1) + ":" + total);
        }
    }
}
