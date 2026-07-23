package mainApp;

public class Student {

    private String url;
    private String countryCode;
    private int rollId;

    public Student() {
        System.out.println("Employee Bean Instantiation");
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setRollId(int rollId) {
        this.rollId = rollId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "url='" + url + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", rollId=" + rollId +
                '}';
    }
}
