package CORE;
class Data<T>{                                     // syntax
    // making the variable obj GENERIC
    private T obj;                                 // this way you can allot value of any type to obj ; its just not limited to any type

    public void setObj(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return obj;
    }

    // making the array GENERIC
    T[] obj2 = (T[]) new Object[10];
    int length=0;
    public void append(T v){
        obj2[length]=v;
        length++;
    }
    public void display(){
        for(int i=0;i< length;i++){
            System.out.println(obj2[i]);
        }
    }
}
public class Generic {
    public static void main(String[] args) {
        Data<Integer> ob= new Data<>();
        ob.setObj(10);
        System.out.println(ob.getObj());

        Data<String> s= new Data<>();
        s.append("hi");
        s.append("hi");
        s.append("hi");
        s.display();
    }
}
