package myApp;

public class Account {

    private int accNo;
    private  String bankName;

    public Account(){
        System.out.println("Account bean Instantiation");
    }

    public Account(int accNo, String bankName) {
        this.accNo = accNo;
        this.bankName = bankName;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
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
                "accNo=" + accNo +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
