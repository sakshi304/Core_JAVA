package ARRAYS;

import java.util.Arrays;

class Array3big{
    public int[]array(int[]arr){
        int[]x= new int[3];
        int max=arr[0];

        for(int i=0;i<3;i++){
            for (int k : arr) {
                if (Arrays.asList(x).contains(k)) {
                    System.out.println(k);
                    continue;
                } else if (k > max) {

                    max = k;

                }

            }
            x[i] = max;
            System.out.println(Arrays.toString(x));


        }

        return x;

    }


    public static void main(String[]args){
        Array3big a= new Array3big();
        System.out.println(Arrays.toString(a.array(new int[]{1,88,0,99,3})));


    }




}
