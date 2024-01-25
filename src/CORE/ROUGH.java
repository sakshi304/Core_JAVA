package CORE;
import java.util.*;
import java.util.Arrays;
/*
class product {
    public static String pro(int n,int num){
        ArrayList<Integer> rem= new ArrayList<>();
        rem.add(num%n);
        int qotient= num/n;
        String res="";
        while(qotient!=0){
            rem.add(qotient%n);
            qotient=qotient/n;
        }
        System.out.println(rem);
        for(int i=0;i<rem.size();i++){
            if(rem.get(i)>9){
                res=(char)(rem.get(i)-9+64)+res;
            }
            else{
                res=rem.get(i)+res;
            }
        }
        return res;
    }

}
*/
/*
class carryGenerated{
    public static int car(int a,int b){
        int c1,c2,sum,carry=0;
        int i=a,j=b;
        while(i>0 && j>0){
            c1=i%10;
            c2=j%10;
            sum=c1+c2;
            if(sum>9){
                carry++;

            }
            i=i/10;
            j=j/10;
        }
        return carry;
    }

}
*/
/*
class interChangeAlphabet{
    public static String change(String str,char c1,char c2){
        String change="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c1 || str.charAt(i)==c2){
                if(str.charAt(i)==c1){
                    change= str.substring(0,i-1)+c2+str.charAt(i+1);
                }
                else{
                    change= str.substring(0,i-1)+c1+str.charAt(i+1);

                }
            }
        }
        return change;
    }

}
*/

/*
class ROUGH
{
    public static int findCount (int arr[], int length, int num, int diff)
    {
        int count = 0;
        for (int i = 0; i < length; i++)
        {
            if ((num - arr[i]) <= diff)
                count++;
        }
        return count > 0 ? count : -1;
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        int num = sc.nextInt ();
        int diff = sc.nextInt ();

        System.out.println (findCount (arr, n, num, diff));
    }
}

 */

class Autobiographical{


    public static int auto(){
        String str="2020";
        int count=0;
        for(int i=0;i<str.length();i++){
            int check=str.charAt(i)-'0';
            System.out.println(check);

            int t=takecount(str,i);
            System.out.println(t);
            if(check==t){
                count++;
                System.out.println(count);

            }
            else{
                return 0;
            }
        }
        return count-1;

    }

    public static int takecount(String str,int c){

        int count=0;
        for(int i=0;i<str.length();i++){
            int j=str.charAt(i)-'0';
            if(j==c){
                count++;
            }
        }
        return count;
    }
}

class ROUGH{

    public static void main(String[] args) {
       // System.out.println(product.pro(12,718));
        //System.out.println(carryGenerated.car(4538,2788));

        //System.out.println(interChangeAlphabet.change("apple ",'a','p'));
        System.out.println(Autobiographical.auto());


    }
}