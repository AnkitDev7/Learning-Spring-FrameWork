package mainApp;

import java.util.List;

public class Employee {

    private String eid;
    private String name;
    private List<String> listofBook;

    private Employee(){
        System.out.println("EMP BEAN Instantiation");
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListofBook(List<String> listofBook) {
        this.listofBook = listofBook;
    }

    public List<String> getListofBook() {
        return listofBook;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", listofBook=" + listofBook +
                '}';
    }
}
