package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();


        HydrgenCar hydrgenCar = new HydrgenCar();
        hydrgenCar.openDoor();
        hydrgenCar.move();

    }
}
