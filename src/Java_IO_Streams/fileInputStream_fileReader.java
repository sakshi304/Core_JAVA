package Java_IO_Streams;

import java.io.FileInputStream;
import java.io.FileReader;

public class fileInputStream_fileReader  {
    public static void main(String[] args) throws Exception {
        try(FileReader fr=new FileReader("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java.txt")){
            int x;


            while((x=fr.read())!=-1){

                System.out.print((char)x);
            }

    }
        try(FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java.txt")){
            int x;

            while((x=fis.read())!=-1){

                System.out.print((char)x);
            }
        }
//    public static void main(String[] args) throws Exception {
//        try(FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java.txt")){
//            fis.read();
//            System.out.println(fis.read());
//        }
   }
}
