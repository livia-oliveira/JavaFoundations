package study_materials.exercises.exercise1;

public class TestLamp {
  public static void main(String[] args) {
    Lamp lamp = new Lamp();

    lamp.on();
    lamp.showStatus();
    lamp.off();
    lamp.showStatus();
    lamp.changeStatus();
    lamp.showStatus();
  }
}
