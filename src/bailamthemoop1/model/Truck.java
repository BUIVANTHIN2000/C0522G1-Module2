package bailamthemoop1.model;

public class Truck extends Vehicle {
    private int tonnage;

    @Override
    public String toString() {
        return "Truck{" + super.toString()+
                "tonnage=" + tonnage +
                '}';
    }

    public Truck() {
    }

    public Truck(int seaOfControl, String maFactureName, String yearManuFature, String owner, int tonnage) {
        super(seaOfControl, maFactureName, yearManuFature, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
}
