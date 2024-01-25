package Java_IO_Streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;

// classes expalined :
// 1. ByteArrayOutputStream
// 2. ByteArrayInputStream
// 3. CharArrayReader
// 4. CharArrayWriter
public class ByteStreams_CharArrayReader {
    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream bis=new ByteArrayOutputStream(20);
        bis.write('a');
        bis.write('b');
        bis.write('c');
        bis.write('d');
        byte[]a = bis.toByteArray();
        System.out.println("ByteArrayOutputStream");
        for(byte y:a){
            System.out.println((char)y);
        }

        byte[] b= {'a','b','c','d','e','f','g'};
        ByteArrayInputStream bos= new ByteArrayInputStream(b);
        int x;
        System.out.println("ByteArrayInputStream");
        while(( x=bos.read())!=-1){
            System.out.println((char)x);

        }
        System.out.println(bos.markSupported());

        System.out.println("Chararraywriter :");
        CharArrayWriter cw=new CharArrayWriter();
        cw.write('l');
        cw.write('m');
        cw.write('n');
        cw.write('o');
        char[]t=cw.toCharArray();
        for(char i:t){
            System.out.println(i);
        }

        System.out.println("Chararrayreader: ");
        char[]c={'x','y','z','q'};
        CharArrayReader cr=new CharArrayReader(c);
        while((x=cr.read())!=-1){
            System.out.println(x);    // to print character (char)x
        }

    }
}
