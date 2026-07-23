package mainApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Crud crud = (Crud) ac.getBean("Crud");
//        crud.insert(17,"raju","add1",100);
//        crud.update(16 ,"kaju");
//        crud.delete(16);
//        crud.readAll();
//        crud.readAllPojoBased();
        crud.readSingleData(12);
    }
}