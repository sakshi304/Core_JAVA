package Java_IO_Streams;

import java.io.*;
class Student{
    int rollno;
    String name;
    String college;
}
class write{
    write() throws Exception{
        FileOutputStream fo=new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serial1.txt");
        PrintStream ps=new PrintStream(fo);
        Student s=new Student();
        s.rollno=10;
        s.name="sakshi";
        s.college="D.Y.Patil";
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.college);
        fo.close();
        ps.close();
    }
}
class read{
    read() throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serial1.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));   // you need to convert since fis belongs to ByteStream class and br to CharacterStream class
        Student s=new Student();
        // reads line by line hence br.readline: drawback you need to have clear idea of file about the data
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.college=br.readLine();
        System.out.println(s.rollno+" "+s.name+" "+s.college);
        fis.close();
        br.close();
    }
}
public class Serialization_Solution_1 {
    public static void main(String[] args) throws Exception {
            write w=new write();
            read r=new read();
    }
}
