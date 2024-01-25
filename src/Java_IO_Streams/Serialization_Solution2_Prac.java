package Java_IO_Streams;

import java.io.*;

class write4{
    float[]list= {1.2f,3.4f,4f,5f,6.3f};
    int n=list.length;
    int i;
    write4()throws Exception{
        FileOutputStream fo=new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serialPrac.txt");
        DataOutputStream dos=new DataOutputStream(fo);
        dos.writeInt(n);
        while(i<n){
            dos.writeFloat(list[i]);
            i++;
        }
        fo.close();
        dos.close();
    }
}
class read4{
    read4()throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serialPrac.txt");
        DataInputStream dis=new DataInputStream(fis);
        int n=dis.readInt();
        int i = 0;
        while(i<n){
            System.out.println(dis.readFloat());
            i++;
        }
        fis.close();
        dis.close();
    }
}
public class Serialization_Solution2_Prac {
    public static void main(String[] args)throws Exception {
        write4 w=new write4();
        read4 r=new read4();
    }
}
