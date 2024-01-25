package DSA;

import java.util.Arrays;

class selection{
    public int[] sort(int[]arr){
        int temp,min;
        for(int i=0;i<arr.length-1;i++){
            min= i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;

                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    return arr;
    }
}
public class Selection_sort {
    public static void main(String[] args) {
        int[]arr={45,0,2,1};
        selection s= new selection();
        System.out.println("Before Sort:"+ Arrays.toString(arr));
        System.out.println("After Sort: "+Arrays.toString(s.sort(arr)));
    }
}
