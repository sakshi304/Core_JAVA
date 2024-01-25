package Java_IO_Streams;

import java.io.*;

// -----------THIS IS THE SOLUTION FOR SERIALIZING AN OBJECT-----------
class student2 implements Serializable {
    private int rollno;
    private Float avgmarks;
    private String name;
    private String college;
    private static int data=10;
    private transient int t;
    student2(){

    }
    student2(int rollno,Float avgmarks,String name, String college){
        this.rollno=rollno;
        this.avgmarks=avgmarks;
        this.name=name;
        this.college=college;
        data=500;
        t=500;

    }

    public String toString(){
        return "\nStudent Details"+
                "\nRoll no: "+rollno+
                "\nAvgMarks: "+avgmarks+
                "\nName: "+name+
                "\nCollege: "+college+
                "\nData: "+data+
                "\nt: "+t;
    }
}

//class write3{
//    write3() throws Exception{
//        FileOutputStream fo=new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serialFinal.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fo);
//        student2 s=new student2(10,89.56f,"sakshi","DY PATIL");
//        oos.writeObject(s);
//        fo.close();
//        oos.close();
//    }
//}

class read3{
    read3()throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serialFinal.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        student2 s=(student2)ois.readObject();
        System.out.println(s);
        fis.close();
        ois.close();
    }
}
public class Serialization_Serialization {
    public static void main(String[] args) throws Exception {
     //   write3 w=new write3();
        read3 r=new read3();
    }

}
