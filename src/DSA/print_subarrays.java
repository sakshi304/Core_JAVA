package DSA;


//Time complexity: O(n2)
//Space commplexity: O(n)    as a new string created n times
//public class ROUGH {
//    public static void printSubarrays(Integer[]numbers){
//        StringBuilder g=new StringBuilder();
//        for(int x=0;x<(numbers.length)-1;x++){
//            g=g.append(numbers[x]);
//            //System.out.println(g);
//            for(int j=x+1;j<(numbers.length);j++){
//                g=g.append(numbers[j]);
//                System.out.println(g);
//            }
//            g=new StringBuilder();
//
//        }
//    }
//    public static void main(String[] args) {
//        Integer []num={1,2,3,4,5};
//        printSubarrays(num);
//    }
//}
public class print_subarrays {
    public static void printSubarrays(Integer[]numbers){
        int i=0;
        int largest=Integer.MIN_VALUE;
        for(int x=0;x<(numbers.length)-1;x++){
            int start=x;
            for(int j=x+1;j<(numbers.length);j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    i=i+numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                if(i>largest){
                    largest=i;
                }
                i=0;
                System.out.println();
            }

        }
        System.out.println("LARGEST sum: "+largest);
    }
    public static void main(String[] args) {
        Integer []num={1,2,3};
        printSubarrays(num);
    }
}
