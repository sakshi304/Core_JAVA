package CORE;

public class Exception_try_catch {
    public static void main(String[] args) {
        int[] a = {10, 0, 1, 7, 5};

        try {

            int r = a[1] / a[0];
            System.out.println("Division is" + r);
            try {
                System.out.println(a[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}