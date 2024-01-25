package DSA;

import java.util.Arrays;

class insertion{
    public int[] sort(int[]arr){
        int key,j,index=0;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            arr[j + 1] = key;
            }
        return arr;

    }



    }


public class Insertion_Sort {
    public static void main(String[] args) {
        int[]arr={45,0,2,1};
        insertion i= new insertion();
        System.out.println("Before Sort:"+ Arrays.toString(arr));
        System.out.println("After Sort: "+Arrays.toString(i.sort(arr)));
    }
}
