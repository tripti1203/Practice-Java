import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double sum=0;
        double[] element= new double[5];
        element[0]=10.00;
        element[1]=10.00;
        element[2]=10.00;
        element[3]=10.00;
        element[4]=10.00;
        for(int i=0;i<element.length;i++){
            sum= sum+element[i];
        }
        double avg= sum/element.length;
        System.out.print("Average of all elements is: "+avg);
    }
}
