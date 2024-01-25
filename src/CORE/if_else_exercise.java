
package CORE;
import java.util.Scanner;

public class if_else_exercise {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        float[][] exam = new float[3][5];
        int e;
        for(int i=0; i<3 ;i++){
            System.out.format("Enter data for rno %d",i);
            System.out.println("enter marks for english , maths , science sequentially");
            for (int j=0; j<exam[1].length ;j++){
                if(j==3){
                    break;
                }
                e = n.nextInt();
                exam[i][j]= e;


            }
        }
        float percent;

        for(int i=0;i<3;i++){
            for(int j=0 ;j<4;j++){
                if(j==3){
                    exam[i][3]= exam[i][0]+exam[i][1]+exam[i][2];
                    percent = (exam[i][3]/300) *100;
                    exam[i][4]=percent;

                }

            }
        }
        System.out.println("rollno\tenglish\t\tmaths\t\tscience\t\ttotal\t\tPercentage\n");

        for(int i=0; i<3;i++){
            System.out.print(i+1);
            for(int j=0; j<exam[i].length;j++){
                System.out.print("\t\t"+exam[i][j]);
            }
            System.out.println("");
        }
        char c=1;
        int ch;

        do {
            int rno;
            System.out.println("enter rno of student:");
            rno = n.nextInt();
            switch (c) {

                case 1:
                    for (int i = rno; i < 3; i++) {
                        for (int j = 4; j < 5; j++) {
                            if (exam[i][4] > 40) {
                                System.out.println("Percentage : " + exam[i+1][4]);
                                System.out.print("\tPass");
                            }
                            else {
                                System.out.println("Percentage : " + exam[i][4]);
                                System.out.println("Fail");
                            }

                        }
                        break;
                    }
            }
            System.out.println("do u wanna conti 1/0");
            ch= n.nextInt();
        }while(ch==1);
    }





}


