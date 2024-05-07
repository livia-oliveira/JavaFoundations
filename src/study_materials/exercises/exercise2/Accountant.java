package study_materials.exercises.exercise2;

public class Accountant {

  private static int accon;

  public Accountant(){
    accon++;
  }

  public static void increment(){
    accon++;
  }

  public static void reset(){
    accon = 0;
  }

  public static int getValue(){
    return accon;
  }

}
