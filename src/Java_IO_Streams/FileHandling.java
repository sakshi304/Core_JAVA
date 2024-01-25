package Java_IO_Streams;

import java.io.*;

public class FileHandling
{
    public static void main(String[] args) throws Exception
    {
        // select path of any directory on you computer
        File f=new File("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams");
        System.out.println(f.isDirectory());
        File list[]=f.listFiles();

        for(File x:list)
        {
            System.out.print(x.getParent()+":"+x.getName());
            System.out.println("->"+x.getPath());
        }

    }
}
