package CORE;
/*
//import java.util.*;
//public class HACKER_RANK {
//    public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            int i = scan.nextInt();
//            String s = scan.nextLine();
//            double d = scan.nextDouble();
//
//
//            // Write your code here.
//
//            System.out.println("String: " + s);
//            System.out.println("Double: " + d);
//            System.out.println("Int: " + i);
//            scan.close();
//        }
//
//}
import java.util.*;
import java.io.*;
import java.lang.Math.*;

class HACKER_RANK{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double x= a+b;
            for(int j=1;j<n+1;j++){
                int m = (int)Math.pow(2,j) *b;
                System.out.print(x+" ");
                x= x+m;

            }
        }
        in.close();
    }
}
    long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                        if(x>=-128 && x<=127)System.out.println  ("* byte\n* short\n* int\n* long");
                        else if(x>=-32768 && x<=32767)System.out.println("* short\n* int\n* long");
                        else if(x>= -y && x<=y-1)System.out.println("* int\n* long");
                        else if(x>= -z && x<z-1)System.out.println("* long");
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HACKER_RANK{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int counter=1;
        while(scan.hasNext()){
            System.out.println("Give input");
            str= scan.next();
        }
        while(scan.hasNext()){
            str= scan.next();
            System.out.println(counter+scan.nextLine());
            counter++;
        }
    }
}