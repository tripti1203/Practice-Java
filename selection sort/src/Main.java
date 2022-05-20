import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array  : ");
        int num = scanner.nextInt();
        int[] array = new int[num];
        System.out.println("Enter the elements :");
        for(int i=0;i<num;i++){
            array[i] = scanner.nextInt();
        }
        Selection_sort(array,num);
        System.out.println("Sorted array is : ");
        for(int i=0;i<num;i++)
            System.out.print(" " + array[i]);
    }
    static void Selection_sort(int[] array,int num){
        int i,j,temp,pos=0;
        for(i=0;i<num;i++){
            int min =array[i];
            pos=i;
            for(j=i+1;j<num;j++){
                if(array[j]<min){
                    min=array[j];
                    pos=j;
                }
            }
            temp = array[pos];
            array[pos]=array[i];
            array[i]=temp;
        }
        System.out.println(i);
    }
}
