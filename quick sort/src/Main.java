import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an array :");
        int num = scanner.nextInt();
        int i;
        int[] array = new int[num];
        System.out.print("Enter the elements :");
        for(i=0;i<num;i++){
            array[i] = scanner.nextInt();
        }
        sort(array,0,num-1);
        System.out.println("The sorted list is...");
        for(i=0;i<num;i++){
            System.out.print(" " + array[i]);
        }
    }
    static int partition(int[] array,int beg,int end){
        int pivot=array[end];
        int i=beg-1;
        int j,temp;
        for(j=beg;j<end;j++){
            if(array[j]<pivot){
                i++;
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
         temp=array[i+1];
        array[i+1]=array[end];
        array[end]=temp;
        return i+1;
    }
    static void sort(int[] array,int beg,int end){
        if(beg<end){
            int pi = partition(array, beg, end);
            sort(array, beg, pi-1);
            sort(array, pi+1, end);
        }
    }
}
