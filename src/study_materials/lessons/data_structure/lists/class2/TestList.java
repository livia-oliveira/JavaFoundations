package study_materials.lessons.data_structure.lists.class2;

import study_materials.lessons.data_structure.lists.Vector;

public class TestList {
  public static void main(String[] args) {
    Vector vector = new Vector(10);

    vector.add("Elemento 1");
    vector.add("Elemento 2");
    vector.add("Elemento 3");

    System.out.println(vector.size());
    System.out.println(vector.toString());
  }
}
