package lab08.exercise1;

public class TestVehicle {
    public static void main(String[] args){
        String output = "Testing the Car no-arg constructor";

        Car c1 = new Car();

        output += "\n\n" + c1.toString() + "\n\n\nTesting the Car multi-arg constructor\n\n";

        Car c2 = new Car(10000,4.5,1.25,2000,"Ferrari","F2",2,"05KY1");

        output += c2.toString() + "\n\n\nTesting the Bicycle no-arg constructor\n\n";

        Bicycle b1 = new Bicycle();

        output += b1.toString() + "\n\nTesting the Bicycle multi-ard constructor\n\n";

        Bicycle b2 = new Bicycle(500,1.5,1,50,"Raleigh","Mountain Bike", 4,true);

        output += b2.toString();

        System.out.println(output);
    }
}
