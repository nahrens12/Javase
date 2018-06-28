import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicle> Ve ;


    public void Garage() {
        Car car1 = new Car(2006, "audi", "a3", 1.6f, "car");
        Car car2 = new Car(2011, "bmw", "m5", 2.2f, "car");

        Ve = new ArrayList<>();
        Ve.add(car1);
        Ve.add(car2);
    }

public int chargeVe()

{
    for (int i = 0; i< Ve.size() ; i++ ) {

        if (Ve.get(i).vehicleType == "Car") {
            return 300;
        } else if (Ve.get(i).vehicleType == "Motorcycle") {
            return 150;
        } else if (Ve.get(i).vehicleType == "Truck") {
            return 500;
        } else {
            return 0;
        }

    }
    return 0;
}
}
