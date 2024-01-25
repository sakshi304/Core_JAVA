package DSA;

public class Binary_srch_ceiling_problem {
    public static void main(String[] args) {
        int []a ={1,3,5,8,11,13,15,18,20};
        int target=2;
        System.out.println("Ceiling number is at position: "+ceiling(a,target));

    }

    static int ceiling(int[]a,int target){
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
        return start;
    }

}
// ceiling nuber:
// once the loop comes to iteration of these numbers comes to (start ,mid ,end) , still number not foundQ345
//