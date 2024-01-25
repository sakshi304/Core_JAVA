package CORE;
class Mythread extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count+++"Mythread");
        }
    }

}
public class Thread_Daemon_Join_Yield {
    public static void main(String[] args) throws InterruptedException {
        Mythread t= new Mythread();
        t.setDaemon(true);
        t.start();

        /*
        //1 and 2 are used when a thread is declared as daemon
        //either use this 1:
        try{Thread.sleep(100);}catch(Exception e){}
        //or this 2:
        Thread mythread = Thread.currentThread();
        mythread.join();

        */

/* following is the yield method:

        int count=1;
        while(true){
            System.out.println(count+++"Main");
            Thread.yield();
        }
*/




    }
}
