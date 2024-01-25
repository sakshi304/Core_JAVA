package Java_IO_Streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class fileOutputStream {


    public static void main(String[] args) /*throws Exception : this can simply be written instead of writing try catch blocks*/{
        try{
            // EASIEST METHOD :
            FileWriter fw=new FileWriter("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java.txt");
            String st="Learning Java from ages ";
            fw.write(st);


            FileOutputStream fos=new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java.txt");
            String str="\nLearning Java from ages ";
            fos.write('a');
            fos.write(str.getBytes());                  // 1. writing array of bytes

            byte[] b=str.getBytes();                    // 2. writing byte by byte
            System.out.println("This is array of bytes of the string in text: "+Arrays.toString(b));

            for(byte x:b){
                fos.write(x);
            }

            fos.write(b,6,str.length()-6);            // 3. giving start and length
            fos.close();

        }
        catch(FileNotFoundException E)
        {
            System.out.println(E);
        }
        catch (IOException e) {                   // for fos.write
            throw new RuntimeException(e);
        }
    }

//public static void main(String[] args) throws Exception {
//    try(FileOutputStream fos=new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java.txt")) {   // try with resources
//        String str = "Learning Java from ages";
//
//        fos.write(str.getBytes());
//    }
//}

}
