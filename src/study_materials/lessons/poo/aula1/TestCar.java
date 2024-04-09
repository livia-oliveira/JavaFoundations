package study_materials.lessons.poo.aula1;

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
  }
}
