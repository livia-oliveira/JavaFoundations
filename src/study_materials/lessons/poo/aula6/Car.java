package study_materials.lessons.poo.aula6;

public class Car {
  String brand;
  String model;
  int number_passengers;
  double fuel_capacity;
  double fuel_consumption;

  public Car(String brand, String model, int number_passengers, double fuel_capacity, double fuel_consumption) {
    this.brand = brand;
    this.model = model;
    this.number_passengers = number_passengers;
    this.fuel_capacity = fuel_capacity;
    this.fuel_consumption = fuel_consumption;
  }

  public Car(String brand, String model) {
    this(brand, model, 10);
    System.out.println("Calling the constructor with 2 parameters.");
  }

  public Car(String brand, String model, int number_passengers) {
    this.brand = brand;
    this.model = model;
    this.number_passengers = number_passengers;
    System.out.println("Calling the constructor with 3 parameters.");
  }

  Car(){

  }
  void DisplayingRange(){
    System.out.println("The car's range is: "+this.fuel_capacity*this.fuel_consumption+"km");
  }
  double getRange(){
//    System.out.println("The getRange method was called");
    return this.fuel_capacity * this.fuel_consumption;
  }

  double calculateFuel(double km){
    double fuel_quantity = km/this.fuel_consumption;
    return fuel_quantity;
  }
}
