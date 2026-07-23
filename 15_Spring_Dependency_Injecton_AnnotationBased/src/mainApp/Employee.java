package mainApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Employee {

    @Autowired
    private Account account;

    @Autowired
    @Qualifier("list2")
    private List<String> listOfBook;

    public Employee() {
        System.out.println("EMP BEAN INSTANTIATION :- ZPC");
    }

//    @Autowired
    public Employee(Account account, List<String> listOfBook) {
        super();
        this.account = account;
        System.out.println("EMP BEAN INSTANTIATION :- PC");
        this.listOfBook = listOfBook;
    }

//    @Autowired
    public void setAccount(Account account) {
        System.out.println("EMP SETTER CALL : ACCOUNT");
        this.account = account;
    }

//    @Autowired
    public void setListOfBook(List<String> listOfBook) {
        System.out.println("EMP SETTER CALL : LIST");
        this.listOfBook = listOfBook;
    }

    public List<String> getListOfBook() {
        return listOfBook;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "account=" + account +
                ", listOfBook=" + listOfBook +
                '}';
    }
}
