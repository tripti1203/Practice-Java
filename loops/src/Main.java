public class Main {

    public static void main(String[] args) {
	int i,count=0;
	for(i=1;i<=40;i++){
        System.out.println(i);
	    if(count==3){
	        System.out.println("Quack");
	        count=0;
        }
	    count++;
	}
    }
}
