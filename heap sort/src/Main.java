public class Main {

    public static void main(String[] args) {
	    int[] array= {10,80,30,90,40,50,70};
	    int num = array.length;
	    int i;
	    System.out.println("Enter the elements : ");
	    for(i=0;i<num;i++){
	        System.out.print(" " + array[i]);
        }
	    System.out.println();
	    sort(array);
	    System.out.println("Sorted list is ....");
	    for(i=0;i<num;i++){
	        System.out.print(" " + array[i]);
        }
    }
    static void sort(int[] array){
        int num= array.length;
        int i,temp;
        for(i=num;i>=0;i--){
            heap(array,num,i);
        }
        for(i=num-1;i>0;i--){
            temp=array[0];
            array[0]=array[i];
            array[i]=temp;

            heap(array,i,0);
        }
    }
    static void heap(int[] array, int num, int i){
        int largest = i;                              //largest represent root
        int left = 2*i+1;
        int right = 2*i+2;
        //if the left child is larger than the root
        if(left<num && array[left]>array[largest]){
            largest=left;
        }
        //if the right child is larger than the root
        if(right<num && array[right]>array[largest]){
            largest= right;
        }
        //if largest is not the root
        if(largest!=i){
            int temp = array[i];
            array[i]= array[largest];
            array[largest]=temp;
            //recursively heap the affected sub tree
            heap(array,num,largest);
        }
    }
}

