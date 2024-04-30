package study_materials.lessons.poo.exercise1.lamp;

public class Lamp {
  private String model;
  private String voltage;
  private int power;
  private String color;
  private String typeLight;
  private int monthWarranty;
  private String[] types;
  private boolean typeLampshade;
  private boolean turnedOn;

  public Lamp() {
  }

  public Lamp(String model, String voltage, int power, String color, String typeLight,
              int monthWarranty, String[] types, boolean typeLampshade, boolean on) {
    this.model = model;
    this.voltage = voltage;
    this.power = power;
    this.color = color;
    this.typeLight = typeLight;
    this.monthWarranty = monthWarranty;
    this.types = types;
    this.typeLampshade = typeLampshade;
    this.turnedOn = on;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getVoltage() {
    return voltage;
  }

  public void setVoltage(String voltage) {
    this.voltage = voltage;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getTypeLight() {
    return typeLight;
  }

  public void setTypeLight(String typeLight) {
    this.typeLight = typeLight;
  }

  public int getMonthWarranty() {
    return monthWarranty;
  }

  public void setMonthWarranty(int monthWarranty) {
    this.monthWarranty = monthWarranty;
  }

  public String[] getTypes() {
    return types;
  }

  public void setTypes(String[] types) {
    this.types = types;
  }

  public boolean isTypeLampshade() {
    return typeLampshade;
  }

  public void setTypeLampshade(boolean typeLampshade) {
    this.typeLampshade = typeLampshade;
  }

  public boolean isTurnedOn() {
    return turnedOn;
  }

  public void setTurnedOn(boolean turnedOn) {
    this.turnedOn = turnedOn;
  }
  
  public void on(){
    setTurnedOn(true);
  }
  
  public void off(){
    setTurnedOn(false);
  }

  public void showStatus(){
    if(isTurnedOn()){
      System.out.println("The lamp is on");
    }else{
      System.out.println("The lamp is off");
    }
  }

  public void changeStatus(){
    if (isTurnedOn()){
      off();
    }else{
      on();
    }
  }


}
