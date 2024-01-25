package Java_IO_Streams;

import java.io.*;

public class Copy_file {
    public static void main(String[] args) throws Exception {
        StringBuffer bf = new StringBuffer();
        try (FileInputStream fis = new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\source1.txt")) {
            int x;
            while ((x = fis.read()) != -1) {
                if (x >= 65 && x <= 90) {
                    int c = x + 32;
                    bf.append((char) c);
                } else {

                    bf.append((char) x);
                }
            }

        }
        try (FileWriter fr = new FileWriter("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\source2.txt")) {
            fr.write(String.valueOf(bf));
        }

        //shortCODE why create another variable sb? :
//        FileInputStream fis=new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\source1.txt");
//        FileOutputStream fos=new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\source1.txt";
//        while((x=fis.read())!=-1){
//            if(x>=65 && x<=90){
//                fos.write(x+32);
//            }
//            else{
//                fos.write(x);
//            }
//  }


        FileInputStream fis1 = new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\source1.txt");
        FileInputStream fis2 = new FileInputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\source2.txt");

        FileOutputStream desti = new FileOutputStream("C:\\Users\\sakshi\\JAVA\\Core_JAVA\\src\\Java_IO_Streams\\destination.txt");
        SequenceInputStream sq = new SequenceInputStream(fis1, fis2);
        int x;
        while ((x = sq.read()) != -1) {
            desti.write(x);
        }
        fis1.close();
        fis2.close();
        desti.close();
        sq.close();

    }
}

