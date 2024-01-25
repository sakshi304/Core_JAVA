package CORE;

class Main {
    public void printArray(int[] array){
        for(int i : array)
            System.out.println(i);
    }
    public static void main(String args[]) {
        try {
            int variable = 5;
        }
        catch (Exception exception) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Execution of finally block");
        }
    }
}
