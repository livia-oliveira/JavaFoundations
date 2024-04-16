package study_materials.lessons.poo.aula7;

public class Car {
  private String brand;
  private String model;
  private int number_passengers;
  private double fuel_capacity;
  private double fuel_consumption;

  public String getBrand(){
    return this.brand;
  }

  public void setBrand(String brand){
    this.brand = brand;
  }

  public String getModel(){
    return this.model;
  }

  public void setModel(String model){
    this.model = model;
  }

  public int getNumber_passengers(){
    return this.number_passengers;
  }

  public void setNumber_passengers(int number_passengers){
      this.number_passengers = number_passengers;
  }

  public double getFuel_capacity() {
    return fuel_capacity;
  }

  public void setFuel_capacity(double fuel_capacity) {
    this.fuel_capacity = fuel_capacity;
  }

  public double getFuel_consumption() {
    return fuel_consumption;
  }

  public void setFuel_consumption(double fuel_consumption) {
    this.fuel_consumption = fuel_consumption;
  }
}
