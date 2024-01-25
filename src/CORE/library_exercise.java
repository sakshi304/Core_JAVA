package CORE;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
class library{


    String [] arr_books = new String[10];
    String [] issued = new String[10];
    Scanner s= new Scanner(System.in);
    int count=0;
    public void addBook(){
        System.out.println("enter no of books to added: ");

        int no= s.nextInt();
        for (int i=0;i<=no;i++){
            System.out.println("Enter ook name :");
            String book= s.nextLine();
            this.arr_books[i]=book;
        }
        System.out.println(Arrays.toString(this.arr_books));
    }
    public void issueBook(String[] x ){
        System.out.println("Which? ");
        String which = s.nextLine();
        for(int i=0 ;i<= x.length;i++){
            if (Objects.equals(x[i], which)){
                this.issued[count]=x[i];
                count++;

                break;
            }
        }
            System.out.println(Arrays.toString(this.issued));

    }
    public void available(library lb){
        System.out.println(Arrays.toString(lb.arr_books));
    }
}
public class library_exercise {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        library lb= new library();
        System.out.println("1.Addbook \n2.issuebook \n3.returnbook \nShowAvailablebooks");
        System.out.println("Enter Choice");
        int ch = s.nextInt();
        System.out.println(Arrays.toString(lb.arr_books));
        switch (ch) {
            case 1 : lb.addBook();

            case 2:
                lb.issueBook(lb.arr_books);
                break;
            case 3 :
                lb.available(lb);

        }



    }



}
