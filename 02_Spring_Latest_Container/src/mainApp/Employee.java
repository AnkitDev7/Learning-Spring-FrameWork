package mainApp;

public class Employee {

    static {
        System.out.println("Jai Shri Ram Static method Started");
    }

    public Employee(){
        System.out.println("Constructor Calling");
    }

    public void start(){
        System.out.println("Employee is a Ready");
    }
}
