package DSA;
import java.util.*;
public class Linear_Search {

    public static void main(String[] args) {
        int[] arr = {1, 18, 0, 12, 13};
        Integer i=12;
        String str=i.toString();
        System.out.println(str.length());

        System.out.println(min(arr));
        int[][] array = {
                {1, 2},
                {5, 4}
        };
        int target=4;
        System.out.println(TwoDarray(array,target));

        System.out.println("No of even digit elements are: "+evencount(arr));
        System.out.println("No of even digit elements are: "+findEvenDigits(arr));
    }
    static int min(int[]arr){
        int least=arr[0];
        for(int element:arr){
            if(element<least){
                least=element;
            }
        }
        return least;
    }
    static int TwoDarray(int[][] arr, int target){
            for(int row=0; row< arr.length;row++){
                for(int col=0;col< arr[row].length;col++){
                    if(target==arr[row][col]){

                        return 1;
                    }
                }

        }
            return -1;
    }
    //method2
    static int findEvenDigits(int[]arr){
        int count=0;
        if(even(arr)){
            count++;
        }
        return count;
    }
    static boolean even(int[]arr){
        int noOfDigits=0;
        for(int element:arr){
            while(element>0){          //12    //1
                element=element%10;    //1     //0
                noOfDigits++;                  //1     //2

            }
        }
        return noOfDigits%2==0;
    }
    //method1
    static int evencount(int[]arr){
        int count=0;
        for(int element: arr){
            Integer x= element;
            int s= x.toString().length();
            if(s%2==0){
                count++;
            }
        }
        return count;

    }




}
