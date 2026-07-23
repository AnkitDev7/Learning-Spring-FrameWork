package mainApp;

public class Account {

    private int accNo;
    private String bankName;

    public Account(int accNo , String bankName) {
        super();
        this.accNo = accNo;
        this.bankName = bankName;
    }

    public Account(){

    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
