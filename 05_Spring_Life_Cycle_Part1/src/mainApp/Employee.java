package mainApp;

import java.util.UUID;

public class Employee {

    private String id;    // Dependency

    private Account account;

    public Employee(String  id) {
        super();
        this.id = id;
        System.out.println("EMployee Bean Instantiated Through Paramitarized Constructor");
    }

    public Employee() {
        System.out.println("EMployee Bean Instantiated");
    }

    public void Start(){
        System.out.println("Employee Tested..."+id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", account=" + account +
                '}';
    }
}

