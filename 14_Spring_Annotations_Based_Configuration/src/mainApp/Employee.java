package mainApp;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("emp")
//@Component
//@Lazy
//@Scope("prototype")
public class Employee {

    public Employee(){
        System.out.println("BEAN Instantiation");
    }

//    @PostConstruct
    public void init(){
        System.out.println("BEAN INIT");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("BEAN DESTROY");
    }

    public void test(){
        System.out.println("Bean Tested");
    }
}
