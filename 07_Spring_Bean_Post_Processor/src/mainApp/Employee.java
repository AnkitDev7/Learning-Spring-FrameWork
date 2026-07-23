package mainApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

    public Employee() {
        System.out.println("Employee Bean Instantiation");
    }



    @PostConstruct
    public void init(){
        System.out.println("Employee Bean Initailization");
    }

    public void test(){
        System.out.println("Employee Bean Custom Method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Employee Bean Destroy");
    }
}
