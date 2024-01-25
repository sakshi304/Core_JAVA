package CORE;

//import static CORE.Employee.logic;                                 //custom class present in current java file  // only static functions can be imported
//import static CORE.Methods_in_java_static_nonstatic.logic;         //class onother file of same package   // only static function of same package can be imported

//import static CORE.dusra.logic;

class Employee{

    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}
public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = harry; // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
//        int salary = john.getSalary();
//        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);


    }

    }

