package DSA;
//problem logic built on paper= 10min
//problem coded= 10min
import java.util.Arrays;

class bubble{
    public int[] sort(int[]arr){
        int len=arr.length;
        int temp;
        for(int i=0;i<len;i++){
            boolean swap=false;
       //     System.out.println(Arrays.toString(arr));
            for(int j=i;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }

            }
            len=len-1;
            if(swap==false){
                break;
            }

        }
        return arr;

    }
}
public class Bubble_Sort {
    public static void main(String[] args) {
        int[]arr={45,0,2,1};
        bubble b= new bubble();
        System.out.println("Before Sort:"+Arrays.toString(arr));
        System.out.println("After Sort"+Arrays.toString(b.sort(arr)));
    }
}
