package CORE;

import java.util.Random;
import java.util.Scanner;

class guess{
      Scanner n = new Scanner(System.in);
      int ComputerInput;
      int x;

  public guess(){                    //random no generation
      Random guess = new Random();
      ComputerInput = guess.nextInt(50);
  }
  public int takeUserInput(){
      System.out.println("Guess the number (1-50): ");
      x = n.nextInt();
      return x;
  }
  public void isCorrectNumber(){


          if (x == ComputerInput) {
              System.out.println("You guessed correct number!!!");


          }
          else if (x < ComputerInput) {
              System.out.println("Number guessed is small");

          }
          else if (x > ComputerInput) {
              System.out.println("Number guessed is big");
          }


  }
}
public class Guess_the_no {

    public static void main(String[] args) {
        guess obj = new guess();

        for(int i=10;i>0;i--) {
            int input= obj.takeUserInput();
            int check = obj.ComputerInput;                  //ComputerInput is public member
            obj.isCorrectNumber();
            if(input==check){
                System.out.println("Ending.....");
                break;
            }
            System.out.println("Attempts left : "+(i-1));


        }
    }

}
