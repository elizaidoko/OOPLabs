package lab08.exercise1;

public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNumber;

    public Car(){
        super();
        setMaxPassengers(0);
        setRegistrationNumber("No registration number specified");
    }

    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String registrationNumber){
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMax passengers: " + getMaxPassengers() + "\nRegistration number: " + getRegistrationNumber();
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}
