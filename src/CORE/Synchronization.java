package CORE;

class mydata
{
    synchronized public void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
            try{Thread.sleep(100);}catch(Exception e){}
        }

    }
}

class MyThread1 extends Thread
{
    mydata d;
    public MyThread1(mydata d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("Hello World");
    }


}

class MyThread2 extends Thread
{
    mydata d;
    public MyThread2(mydata d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("Welcome All");
    }


}

public class Synchronization
{
    public static void main(String[] args)
    {
        mydata data=new mydata();

        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);

        t1.start();
        t2.start();



    }
}