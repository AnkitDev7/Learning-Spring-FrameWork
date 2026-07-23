package mainApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Manager {

    public Manager() {
        System.out.println("manager Bean Instantiation");
    }

    @PostConstruct
    public void init(){
        System.out.println("manager Bean Initailization");
    }

    public void test(){
        System.out.println("manager Bean Custom Method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("manager Bean Destroy");
    }



}
