import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int i;
        for(i=0;i<array.length;i++){
            System.out.print("Enter the numbers in an array : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be found : ");
        int key = scanner.nextInt();
        binary_search(array,0,9,key);
    }
    public static void binary_search(int[] array, int lowerbound , int upperbound,int key ){
        int position;
        int compare_count=1;
        position= (lowerbound+upperbound)/2;
        while((array[position] != key) && (lowerbound<upperbound)){
            compare_count++;
            if(array[position]>key){
                upperbound=position-1;
            }
            else{
                lowerbound=position+1;
            }
            position= (lowerbound+upperbound)/2;
        }
        if(lowerbound<upperbound){
            System.out.println("The binary search completed is " + compare_count + " comparisons");
            System.out.println("The number " + key + " is found at index " + position);
        }
        else{
            System.out.println("The binary search is completed at " + compare_count + " comparisons");
            System.out.println("The number " + key + " is not found in the array...");
        }
    }
}
