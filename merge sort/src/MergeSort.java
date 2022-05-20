
public class MergeSort {

    static void merge(int[] array,int beg, int mid, int end){

        int l = mid-beg+1;
        int r= end-mid;

        int[] LeftArray = new int[l];
        int[] RightArray = new int[r];

        for(int i=0;i<l;i++) {
            LeftArray[i] = array[beg + i];
        }
        for(int j=0;j<r;j++) {
            RightArray[j] = array[mid + 1 + j];
        }
        int i=0;
        int j=0;
        int k= beg;
        while(i<l && j<r){
            if(LeftArray[i] <= RightArray[j]){
                array[k] = LeftArray[i];
                i++;
            }
            else{
                array[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while(i<l){
            array[k] = LeftArray[i];
            i++;
            k++;
        }
        while(j<r){
            array[k] = RightArray[j];
            j++;
            k++;
        }
    }
    static void sort(int[] array,int beg, int end){
        if(end>beg){
            int mid= (beg+end)/2;
            sort(array,beg,mid);
            sort(array,mid+1,end);
            merge(array,beg,mid,end);
        }
    }
    public static void main(String[] args) {

        int i;
        int[] array = {1,3,2,5,4,7,8,6};
        System.out.println(" The elements in the array : ");
        for(i=0;i<array.length;i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
        sort(array,0, array.length-1);
        System.out.println("Sorted list is...");
        for(i=0;i<array.length;i++)
            System.out.print(" " + array[i]);
    }
}
