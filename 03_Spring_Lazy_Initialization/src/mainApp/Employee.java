package mainApp;

public class Employee {

    static {
        System.out.println("Manager Bean Loading");
    }

    public Employee() {
        System.out.println("Employee Bean Instantatead");
    }

    public void start(){
        System.out.println("Start the Employee");
    }
}
