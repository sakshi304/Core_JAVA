package Java_IO_Streams;

import java.io.*;

class write2{
    write2() throws Exception {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serial.txt");
        DataOutputStream is=new DataOutputStream(fos);
        Student s=new Student();     // class declared in Serialization_Solution1 java file
        s.rollno=10;
        s.name="chaitanya";
        s.college="PCU";

        is.writeInt(s.rollno);             // we define the datatype we want
        is.writeUTF(s.name);
        is.writeUTF(s.college);
        fos.close();
        is.close();
    }
}

class read2{
    read2() throws  Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serial.txt");
        DataInputStream ds=new DataInputStream(fis);
        Student s=new Student();
      //  s.name=ds.readUTF();   // drawback : if i change the sequence while reading it will throw error since the data type will writing to the file is defined
        s.rollno=ds.readInt();
        s.name=ds.readUTF();
        s.college=ds.readUTF();
        System.out.println(s.rollno+" "+s.name+" "+s.college);
        fis.close();
        ds.close();
    }
}
public class Serialization_Solution_2 {
    public static void main(String[] args) throws Exception {
        write2 w=new write2();
        read2 r=new read2();
    }
}
