package CORE;

import java.util.Arrays;

public class Array_practice {
    public static void main(String[] args) {
        int[] arr = {1,2,8,7,};
        // SWAPPING
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));

        //MAX
        System.out.println( max(arr));

        // REVERSING ARRAY
        reverse1(arr);
        System.out.println(Arrays.toString(arr));

        reverse2(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static int max(int[] arr) {
        int max=arr[0];
        for (int x : arr) {

            if(x>max){
                max=x;
            }
        }
        return max;
    }

    //my solution took over 30 minutes
    static void reverse1(int[] arr){
         int j=arr.length-1;
            for(int i=0;i<arr.length;i++){
                if(i<j){
                    swap(arr,i,j);
                    j=j-1;
                }
                else{
                    break;
                }
            }
    }

    //solution by kunal
    static void reverse2(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

}
