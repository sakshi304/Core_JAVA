package CORE;

import java.util.Date;

class Student{
    private static int count=1;
    String rollno;

    Student(){
        rollno=getRollno();
    }
    public String getRollno(){
        Date d= new Date();
        rollno="UNIV-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rollno;
    }

}
public class Static_example {
    public static void main(String[] args) {
    Student m1= new Student();
        Student m2= new Student();
        Student m3= new Student();

        System.out.println("m1 rollno: "+m1.rollno);
        System.out.println("m2 rollno: "+m2.rollno);
        System.out.println("m3 rollno: "+m3.rollno);


    }
}
