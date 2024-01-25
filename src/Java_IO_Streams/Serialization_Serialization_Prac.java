package Java_IO_Streams;

import java.io.*;

class customer implements Serializable {
    static int count=0;
    int cid=0;
    String name;
    String addr;
    customer(String n,String a){
        cid=++count;
        name=n;
        addr=a;
    }
    public String toString(){
        return "\nCustomer Details"+
                "\nCid: "+cid+
                "\ncname: "+name+
                "\ncaddr: "+addr;

    }
}
class write5{
    write5(customer[]list) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serialPrac2.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        int n=list.length;
        int i=0;
        oos.writeInt(n);
        while(i<n){
            oos.writeObject(list[i]);
            i++;
        }
        oos.close();
        fos.close();

    }
}
class read5{
    read5(customer[]list) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\serialPrac2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int n=ois.readInt();
        int i=0;
        while(i<n){
            customer c=(customer)ois.readObject();
            System.out.println(c);
            i++;
        }
        fis.close();
        ois.close();
    }
}
public class Serialization_Serialization_Prac {
    public static void main(String[] args) throws Exception {
            customer c1=new customer("sakshi","Virar");
            customer c2=new customer("Chaitu","Akurdi");
            customer[] list={c1,c2};
            write5 w=new write5(list);
            read5 r=new read5(list);

    }
}
