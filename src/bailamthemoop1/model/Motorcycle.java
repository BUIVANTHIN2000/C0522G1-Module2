package bailamthemoop1.model;

public class Motorcycle extends Vehicle {
    private int wattage;

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString()+
                "wattage=" + wattage +
                '}';
    }

    public Motorcycle() {
    }

    public Motorcycle(int seaOfControl, String maFactureName, String yearManuFature, String owner, int wattage) {
        super(seaOfControl, maFactureName, yearManuFature, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}
