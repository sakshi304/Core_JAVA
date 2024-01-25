package CORE;

class whiteboard{
       String sent;
       int count=0;

       synchronized public void write(String y){
           while(count!=0) {
               try {
                   wait();
               } catch (Exception e) {
               }
           }
           System.out.println("teacher writes"+y);
           sent=y;
           count=count+1;
           System.out.println(count);
           notifyAll();
       }
       synchronized public void read(){
           System.out.println(count);
           if(count>students.attendance){
               count=0;
               try {
                   notifyAll();
               }catch (Exception e){
                   System.out.println(e);
               }
           }
           else if(count>0){
               System.out.println("Student "+count+sent);
               count=count+1;
               notifyAll();
           }
           else{
               try{wait();}catch(Exception e){}
           }

       }


}
class teacher extends Thread{
    whiteboard obj;

    teacher(whiteboard o){
        obj=o;
    }
    String[]s= {"java","is a","language"};
    @Override
    public void run() {

        for(int i=0;i<s.length;i++){

            obj.write(s[i]);
            System.out.println("teacher is writing");
        }
    }
}
class students extends Thread{
    static int attendance=0;
    whiteboard ob;
    students(whiteboard ob){
        attendance++;
        this.ob=ob;
    }

    @Override
    public void run() {
        System.out.println("attend: "+attendance);
        ob.read();
    }
}
public class InterThread_communi_prac{

    public static void main(String[] args) {
        whiteboard w= new whiteboard();
        teacher t= new teacher(w);

        students s1= new students(w);
        students s2= new students(w);
        students s3= new students(w);
        students s4= new students(w);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();




    }
}
