package study_materials.lessons.poo.aula3;

public class Car {
  String brand;
  String model;
  int number_passengers;
  double fuel_capacity;
  double fuel_consumption;

  void DisplayingRange(){
    System.out.println("The car's range is: "+fuel_capacity*fuel_consumption+"km");
  }

  double getRange(){
    System.out.println("The getRange method was called");
    return fuel_capacity*fuel_consumption;
  }

}
