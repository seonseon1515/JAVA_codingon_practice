package practice;

public class VehiclesMain {

	public static void main(String[] args) {
		Bus bus = new Bus("Hyundai","City Bus", 2022, 345345);
		Car car = new Car("Toyota","Camry",2023,false);
		Motorcycle moto = new Motorcycle("Harley-Davidson","Sportster",2021,'A');
		
		bus.BusText();
		car.CarText();
		moto.MotorcycleText();

	}

}
