import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int i;
    	int[] a= new int[20];
    	for(i=0;i<a.length;i++){
    		a[i]= i+1;
		}
    	for(i=a.length-1;i>=0;i--){
    		System.out.println(a[i]);
		}
    }
}
