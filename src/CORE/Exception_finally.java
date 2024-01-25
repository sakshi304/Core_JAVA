package CORE;

public class Exception_finally {
    static void meth1() throws Exception {
        try{
            throw new Exception();
        }
        finally {
            System.out.println("Mujhe kuch nhi pata method terminate ho jae kisi exception se pr mai execute hone ko mangta");
        }
    }
    public static void main(String[] args) throws Exception {
        meth1();
    }
}
