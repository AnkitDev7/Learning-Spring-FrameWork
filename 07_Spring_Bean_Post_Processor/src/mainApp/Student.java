package mainApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

    public Student() {
        System.out.println("Student Bean Instantiation");
    }

    @PostConstruct
    public void init(){
        System.out.println("Student Bean Initailization");
    }

    public void test(){
        System.out.println("Student Bean Custom Method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Student Bean Destroy");
    }

}
