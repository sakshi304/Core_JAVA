package CORE;

class Myarray<T>{
    public T x;
    public void setX(T x){
        this.x=x;
    }
}
class Myarray2<T> extends Myarray<T>{        // Myarray will also only accept the type which will be provided to Myarray2

}
class Myarray3 extends Myarray<Integer>{     // Myarray3 will accept value of type integer only

}
public class Generic2 {
    public static void main(String[] args) {
        Myarray<Double> cv= new Myarray2<>();
        cv.setX(10.21);

        Myarray2<String> obj = new Myarray2<>();
        obj.setX("hi");

        Myarray3 obj1 = new Myarray3();
        obj1.setX(10);

    }
}
