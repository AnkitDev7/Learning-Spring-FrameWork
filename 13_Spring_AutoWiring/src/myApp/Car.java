package myApp;

public class Car {

    private String carName;
    private int carNumber;

    public Car(){
        System.out.println("Car bean Instantiation");
    }

    public Car(String carName, int carNumber) {
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carNumber=" + carNumber +
                '}';
    }
}
