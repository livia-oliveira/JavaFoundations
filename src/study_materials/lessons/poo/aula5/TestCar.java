package study_materials.lessons.poo.aula5;

public class TestCar {
  public static void main(String[] args) {
    Car van = new Car();

    van.brand = "Fiat";
    van.model = "Ducato";
    van.number_passengers = 10;
    van.fuel_capacity = 100;
    van.fuel_consumption = 0.2;

    System.out.println(van.brand);
    System.out.println(van.model);
    System.out.println(van.fuel_capacity);
    System.out.println(van.number_passengers);
    System.out.println(van.fuel_consumption);

//    double range = van.getRange();
//    System.out.println("The car's range is "+range+"km");
//
//    double fuel_quantity = van.calculateFuel(10);
//    System.out.println("The required fuel quantity is "+fuel_quantity+"km");

    System.out.println("------------------------------");

    Car van2 = new Car("Fiat", "Fiorino");
    System.out.println(van2.brand);
    System.out.println(van2.model);

  }
}
