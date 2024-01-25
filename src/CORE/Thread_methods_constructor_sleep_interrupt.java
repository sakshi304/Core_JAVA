package CORE;

import com.sun.source.tree.TryTree;

class Threadtest extends Thread {
    public Threadtest(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}

class Threadtest2 implements Runnable{

    @Override
    public void run() {
        int count=0;
        while(true) {
            System.out.println(count+"Runnable thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            count++;
        }
    }
}



public class Thread_methods_constructor_sleep_interrupt {
    public static void main(String[] args) {
        Threadtest t= new Threadtest("thread 1");
        System.out.println("ID: "+t.getId());
        System.out.println("Name: "+t.getName());
        System.out.println(t.getPriority());
        System.out.println("Before thread is started: "+t.getState());

        t.start();
        System.out.println("After thread is started: "+t.getState());

        Thread r= new Thread(new Threadtest2());
        r.start();

        r.interrupt();

        int n=0;
        while(true){
            System.out.println(n+"Main thread");
            n++;
            try{
                Thread.sleep(1000);

            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }


    }

}
