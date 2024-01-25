package CORE;
// RECOMPILE THIS FILE IF THROWS ERROR
class ATM{
    synchronized public void checkBalance(String name){
        System.out.println("Balance of "+name+" : mala nahi mahit");
    }
    synchronized public void withdraw(String name,int amount){
        System.out.println("Withdrawl by "+name+" is "+amount);
    }
}

class customer extends Thread{
    ATM atm;
    String name;
    int amount;
    public customer(ATM atm,String name,int amount){
        this.name=name;
        this.amount=amount;
        this.atm=atm;

    }

    public void run(){

        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }
}

public class Syncchronization_prac_ATM {
    public static void main(String[] args) {
        ATM atm= new ATM();
        customer c1= new customer(atm,"Suresh",2000);
        customer c2= new customer(atm,"Ramesh",3000);
        c1.start();
        c2.start();


    }
}
