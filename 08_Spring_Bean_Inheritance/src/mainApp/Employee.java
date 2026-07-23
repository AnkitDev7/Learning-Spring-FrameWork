package mainApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

    private String url;
    private String countryCode;
    private int eid;

    public Employee() {
        System.out.println("Employee Bean Instantiation");
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "url='" + url + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", eid=" + eid +
                '}';
    }
}
