import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.print("Enter the size of array :");
        int num = scanner.nextInt();
        int[] array = new int[num];
        System.out.println("Enter the elements : ");
        for(i=0;i<num;i++) {
            array[i] = scanner.nextInt();
        }
        Insertion_sort(array,num);
        System.out.println("Sorted list is...");
        for(i=0;i<num;i++){
            System.out.print(" " + array[i]);
        }
    }
    static void Insertion_sort(int[] array,int num){
        int i,j=0;
        for(i=1;i<num;i++){
            int key = array[i];
             j = i-1;

            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1] = key;
        }
    }
}
