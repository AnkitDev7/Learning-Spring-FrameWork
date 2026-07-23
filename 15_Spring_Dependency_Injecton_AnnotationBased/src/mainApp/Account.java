package mainApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Account {

//    @Value("100400")
    private int an ;

//    @Value("PNB")
    private String bankName;

//    @Value("#{'raju'}")
//    @Value("#{test.doTest()}")
    @Value("#{T(mainApp.testStatic).doTestStatic}")
    private String bankAddress;

    @Value("${db.url}")
    private String url;

    @Value("#{environment['db.url']}")
    private String SpelURL;

    @Value("#{test.cheakAmmount()>500 ? 'valid' : 'invalid'}")
    private String amount;

    @Value("#{{'b1','b2'}}")
    private List<String> list;

    public Account(){
        System.out.println("AC BEAN INSTANTIATION :- ZPC");
    }

    @Autowired
    public Account(@Value("101")int an, @Value("INDIAN") String bankName) {
        super();
        System.out.println("AC BEAN INSTANTIATION :- PC");
        this.an = an;
        this.bankName = bankName;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "an=" + an +
                ", bankName='" + bankName + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", url='" + url + '\'' +
                ", SpelURL='" + SpelURL + '\'' +
                ", amount='" + amount + '\'' +
                ", list=" + list +
                '}';
    }
}
