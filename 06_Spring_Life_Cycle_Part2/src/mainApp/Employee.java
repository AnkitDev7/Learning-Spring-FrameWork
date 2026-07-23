package mainApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

    public Employee() {
        System.out.println("BEAN Instatiation");
    }

    public void start(){
        System.out.println("Employee Bean Tested");
    }

    // Initialization
    public void xmlInit(){
        System.out.println("RESOURSE Allocation");
    }

    @PostConstruct
    public void annoInit(){
        System.out.println("RESOURSE Allocation");
    }

    // Destroy
    public  void xmlDestroy(){
        System.out.println("RESOURSE De_Allocation");
    }

    @PreDestroy
    public  void annoDestroy(){
        System.out.println("RESOURSE De_Allocation");
    }

}
