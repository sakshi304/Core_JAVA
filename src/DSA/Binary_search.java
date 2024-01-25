package DSA;

public class Binary_search {
    static int binary(int[]a,int target){
        int start=0;
        int end=a.length-1;
        int mid=start+ (end-start)/2;
        while(start<=end){
            mid=start+ (end-start)/2;

            if(a[mid]<target){
                start=mid+1;            }
            else if (a[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a= {2,3,4,10,18,20};
        int target=2;
        System.out.println(binary(a,target));

    }
}
