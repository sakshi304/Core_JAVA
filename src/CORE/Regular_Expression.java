package CORE;

import java.util.Arrays;

public class Regular_Expression {
    public static void main(String[] args) {
//------------------------------------------REGEX FOR SINGLE OR DOUBLE CHARACTER MATCH---------------------------------
        /*String str1="f";
        System.out.println(str1.matches("."));*/                   // any character (only single)

        /*String str1="a";//b,c
        System.out.println(str1.matches("[abc]"));*/               //

        /*String str1="p";//true for alphabets other than abc
        System.out.println(str1.matches("[^abc]"));*/

        /*String str1="7";//A,a7
        System.out.println(str1.matches("[a-zA-Z0-9]"));//[a-z][0-9]*/

        /* String st="a7";//A,a7
        System.out.println(st.matches("[a-z][0-9]"));*/        // DOUBLE CHARACTER MATCH

        /*String str1="b";
        System.out.println(str1.matches("a|b"));*/

        /*String str1="b";
        System.out.println(str1.matches("\\w"));*/

        /*String str1="5";
        System.out.println(str1.matches("\\d"));*/

      /*  String str1="$";
        System.out.println(str1.matches("\\D"));

        String str="ffrgt";   //returns true if no space in the given string
        System.out.println(str.matches("\\S"));

        String str2=" "; // returns true if there is just space in the string     //returns false even if single character detected
        System.out.println(str2.matches("\\s")); */

//---------------------------------------- REGEX FOR MULTI CHARACTER MATCH -----------------------------------------
        String str5="";
        System.out.println(str5.matches(".*"));    // any character for 0 or more times

        String str6="";
        System.out.println(str6.matches(".+"));    // any character for 1 or more times

        String str7=":";
        System.out.println(str7.matches(".?"));     // any character for 0 or 1 time

         /*String str1="abcdef";//ab6cdef,abBcdef
        System.out.println(str1.matches("[abc]*"));*/    // any character from abc for any number of times


        /*String str1="accbdefg";//accb
        System.out.println(str1.matches("[abc]{3,7}"));*/              //  any character from abc with total length of string minimum 3 and maximum 7

        String str3="john@gmail.com";
        //System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str3.matches("\\w*@gmail(.*)"));      // COMBINATION = any number of digit/character for any number of time + @gmail + any character for any number of time

        String str8 ="1254ABC";
        System.out.println(str8.matches("[\\dA-Z]*"));     // hexadecimal number check

        String str9="0101110";
        System.out.println(str9.matches("[01]*"));     // binary number check

        String str10= "04/04/2002";
        System.out.println(str10.matches("[0-30]{2}/[0-12]{2}/[0-9]{4}"));      //  THIS WILL THROW FALSE VALUE FOR 01,02,03,etc as
                                                                                    // regex checks for every value at every index coz of which if you define regex for 04 as [0-12]{2} then this expression accounts for only'0' from "04" not for the whole "04"
        String str11="04/04/2002";
        System.out.println(str11.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));     // here the regular expression defines range for every digit


        // CODE TO REMOVE SPECIAL CHARACTERS AND SPACES
        // MY-SOLUTION
        String str12="s@ksh!_.30k_kothu r kar";
        String str13="";
        for(int i=0;i<str12.length();i++){
            String st= str12.charAt(i)+"";      // this converts it to string Don't worry the string st does not include space here in its value eg. st="s" and not st="s "
            //System.out.println(st.length());
            if(!st.matches("\\w") || st.matches("\\s")){
                    continue;

            }
            else{
                str13=str13+st;

            }

        }
        System.out.println(str13);
        System.out.println("ok");

        String str14="a@b#C$123";

        // SIR'S SOLUTION
        //1) remove spaces
        String str15="  bac be    btf   bfp  ";
        str15=str15.replaceAll("\\s+"," ").trim();
        System.out.println(str15);

        //2) remove special charac
        str12=str12.replaceAll("\\W+"," ");
        System.out.println(str12);

        //3) Word count in str15
        System.out.println(str15.split("\\s").length);
        //--------- OR --------
        String str16= "bag bad bat big";
        String word[]= str16.split("\\s");
        System.out.println(Arrays.toString(word));

    }

}
