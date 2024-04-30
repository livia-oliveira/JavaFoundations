package study_materials.lessons.poo.exercise1.lamp;

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
