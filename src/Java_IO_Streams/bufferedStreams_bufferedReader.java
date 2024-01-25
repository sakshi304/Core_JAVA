package Java_IO_Streams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class bufferedStreams_bufferedReader {

    public static void main(String[] args) throws Exception {
        // ------------ for ByteStream ----------------------------
        FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java2.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);  // bis is applied over a stream
        System.out.println("File supports mark : "+fis.markSupported());
        System.out.println("Buffer supports mark : "+bis.markSupported());

        System.out.print((char)bis.read());    //l
        System.out.print((char)bis.read());    //e
        bis.mark(10);                  // mark on a
        System.out.print((char)bis.read());   //a
        System.out.print((char)bis.read());   //r
        System.out.print((char)bis.read());   //n
        bis.reset();                          // mark back on a
        System.out.print((char)bis.read());   //a
        System.out.print((char)bis.read());   //r
        System.out.print((char)bis.read());   //n

        //------------for characterStream----------------------------
        FileReader fr=new FileReader("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java2.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println("\nCharacter stream: ");
        System.out.println((char)br.read());
        System.out.println(br.readLine());

    }
}
