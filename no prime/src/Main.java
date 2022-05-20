import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        boolean flag=false;
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        for(i=2;i<=num/2;i++){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        int gap=0;
        int bestGap=0;
        int left=0;
        int right=0;
        for(i=2;i<=num;i++){
            if(!flag){
                gap=0;
            }
            else{
                gap++;
            }
            if(gap>bestGap){
                bestGap=gap;
                right=i;
            }
        }
        left = right-bestGap+1;
        System.out.println("There is no prime between "+ left + " and " + right);
        System.out.println("That is " + bestGap + "consecutive integer");
    }
}
