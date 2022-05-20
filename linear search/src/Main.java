import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        boolean found = false;
        int i;



        for(i=0;i< numbers.length;i++){
            System.out.print("Enter the numbers in the array :");
            numbers[i]= scanner.nextInt();
        }
        System.out.println();
        System.out.print("Enter the number to be found : ");
        int key = scanner.nextInt();
        for(i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("The number " + key + " found at index " + i);
        }
        else{
            System.out.println(key + " is not found in the array...");
        }
    }
}
