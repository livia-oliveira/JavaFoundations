package study_materials.lessons.poo.aula2;

public class Car {
  String brand;
  String model;
  int number_passengers;
  double fuel_capacity;
  double fuel_consumption;

  void DisplayingRange(){
    System.out.println("The car's range is: "+fuel_capacity*fuel_consumption+"km");
  }
}
