package mainApp;

import java.util.UUID;

public class objectFactory {

    private  Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public  Employee getObject(){
        Employee employee = new Employee();
        employee.setId(UUID.randomUUID().toString());

        employee.setAccount(account);

        return employee;
    }
}
