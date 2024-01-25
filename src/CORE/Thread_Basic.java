package CORE;


/*class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}*/

class MyRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class Thread_Basic //implements Runnable //extends Thread
{
    /*public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }*/

    public static void main(String[] args) {

        //MyThread t=new MyThread();
        //Thread_Basic t=new Thread_Basic();
        MyRunnable t=new MyRunnable();
        Thread th=new Thread(t);

        th.start();

        int i=1;
        while(true)
        {
            System.out.println(i+"World");
        }

    }

}