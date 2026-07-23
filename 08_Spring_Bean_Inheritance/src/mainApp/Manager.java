package mainApp;

public class Manager {

    private String url;
    private String countryCode;
    private int magid;

    public Manager() {
        System.out.println("Employee Bean Instantiation");
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMagid(int magid) {
        this.magid = magid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "url='" + url + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", mngid=" + magid +
                '}';
    }


}
