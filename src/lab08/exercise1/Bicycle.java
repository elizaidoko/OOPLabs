package lab08.exercise1;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
        super();
        setGearCount(0);
        setHasBell(false);
    }

    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean hasBell){
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    @Override
    public String toString() {
        String output;
        if(isHasBell())
            output = "Yes";
        else
            output = "No";

        return super.toString() + "\nHas bell: " + output + "\nGear Count: " + getGearCount();


    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}
