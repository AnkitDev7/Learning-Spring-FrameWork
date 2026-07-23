package mainApp;

import org.springframework.stereotype.Component;

@Component("test")
public class Test {

    public String doTest(){
        return "test";
    }

    public int cheakAmmount(){
        return 200;
    }
}
