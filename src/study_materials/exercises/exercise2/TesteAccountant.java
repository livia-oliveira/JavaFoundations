package study_materials.exercises.exercise2;

public class TesteAccountant {

  static void showValue(){
    System.out.println(Accountant.getValue());
  }

  public static void main(String[] args) {
    showValue();
    Accountant.increment();
    Accountant.increment();
    showValue();
    Accountant.reset();
    showValue();

    Accountant a1 = new Accountant();
    Accountant a2 = new Accountant();
    Accountant a3 = new Accountant();
    showValue();

  }
}
