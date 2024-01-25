package HACKER_RANK;

import java.util.Scanner;
public class end_of_file{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int counter=1;
        while(scan.hasNext()){                           // only thing this code has no termination condition
            str= scan.nextLine();                        // .nextLine() = reads complete input line i.e after characters red after space as well
            System.out.println(counter+str);
            counter++;
        }
    }
}