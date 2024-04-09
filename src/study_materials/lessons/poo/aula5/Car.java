package study_materials.lessons.poo.aula5;

public class Car {
  String brand;
  String model;
  int number_passengers;
  double fuel_capacity;
  double fuel_consumption;

  Car(){
    System.out.println("This class has been instantiated");
    number_passengers = 11;
  }

  Car(String brand_, String model_){
    brand = brand_;
    model = model_;
  }
  void DisplayingRange(){
    System.out.println("The car's range is: "+fuel_capacity*fuel_consumption+"km");
  }
  double getRange(){
//    System.out.println("The getRange method was called");
    return fuel_capacity*fuel_consumption;
  }

  double calculateFuel(double km){
    double fuel_quantity = km/fuel_consumption;
    return fuel_quantity;
  }

}
