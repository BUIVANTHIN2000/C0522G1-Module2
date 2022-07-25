package bailamthemoop1.model;

public class Car extends Vehicle {
    private String numberOfSeats; // Số chỗ ngồi
    private String vihecleType; // Kiểu xe

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "numberOfSeats='" + numberOfSeats + '\'' +
                ", vihecleType='" + vihecleType + '\'' +
                '}';
    }
    public Car() {
    }
    public Car(int seaOfControl, String maFactureName, String yearManuFature, String owner, String numberOfSeats, String vihecleType) {
        super(seaOfControl, maFactureName, yearManuFature, owner);
        this.numberOfSeats = numberOfSeats;
        this.vihecleType = vihecleType;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVihecleType() {
        return vihecleType;
    }

    public void setVihecleType(String vihecleType) {
        this.vihecleType = vihecleType;
    }
}
