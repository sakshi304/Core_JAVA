package Java_IO_Streams;

import java.io.*;

class producer extends Thread  {
    OutputStream os;
    int count=1;
    producer(OutputStream s){
        os=s;
    }
    public void run() {
        try {
            while(true){
                os.write(count);
                System.out.println("Producer " + count);
                os.flush();     // us this so that both thread work simultaneously
                count++;
                Thread.sleep(10);
            }
        } catch (IOException e) {} catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
class consumer extends Thread  {
    InputStream is;
    int count=1;
    consumer(InputStream s){
        is=s;
    }
    public void run() {
        try {
            while(true){
            System.out.println("Consumer "+is.read());} }catch (IOException ignored) {}
    }

}
public class Piped_streams {
    public static void main(String[] args) throws Exception{                   //|
        PipedOutputStream pos= new PipedOutputStream();        //|
        PipedInputStream  pis= new PipedInputStream();         //|
        pis.connect(pos);
        producer p=new producer(pos);                          //|
        consumer c=new consumer(pis);
        p.start();
        c.start();
    }
}
