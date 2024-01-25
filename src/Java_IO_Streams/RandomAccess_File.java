package Java_IO_Streams;

import java.io.RandomAccessFile;
import java.sql.SQLOutput;

public class RandomAccess_File {
    public static void main(String[] args) throws Exception{
        RandomAccessFile rf=new RandomAccessFile("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\Java2.txt","rw");
        System.out.println("0 "+(char)rf.read()+" Pointer is at "+rf.getFilePointer());

        System.out.println("1 "+(char)rf.read()+" Pointer is at "+rf.getFilePointer());

        System.out.println("2 "+(char)rf.read()+" Pointer is at "+rf.getFilePointer());

        rf.write('w');  //3

        System.out.println("Pointer is at "+rf.getFilePointer());
        System.out.println("4 "+(char)rf.read()+" Pointer is at "+rf.getFilePointer());

        rf.seek(0);
        System.out.println("0 "+(char)rf.read()+" Pointer is at "+rf.getFilePointer());
        rf.skipBytes(3);
        System.out.println("4 "+(char)rf.read()+" Pointer is at "+rf.getFilePointer());

        rf.write('4');
        rf.seek(5);
        System.out.println((char)rf.read());

        rf.writeInt(4);                        // nhi ho raha execute
        System.out.println((int)rf.readInt());



    }
}
