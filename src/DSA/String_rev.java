package DSA;

//MY_SOLUTION
class reverse{
    String str;
    reverse(String str){
        this.str=str;
    }
    public String rev(int n){
        if(n<0){
            return " ";            //Khali fukat extra space gets created
        }
        return this.str.charAt(n)+rev(n-1);
    }
}
public class String_rev {


    public static void main(String[] args) {
        String str1 = "String";
        int n = str1.length() - 1;
        reverse r = new reverse(str1);
        System.out.println(r.rev(n));

        String str = "MyJava";

        //1. Using StringBuffer Class

        StringBuffer sbf = new StringBuffer(str);

        System.out.println(sbf.reverse());    //Output : avaJyM

        //2. Using iterative method

        char[] strArray = str.toCharArray();

        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);    //Output : avaJyM
        }

        System.out.println();

        //3. Using Recursive Method

        System.out.println(recursiveMethod(str));    //Output : avaJyM
    }

    static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);

    }

}
