package study_materials.lessons.data_structure.lists;

import java.util.Arrays;

public class Vector {

  private String[] elements;
  private int size;

  public Vector(int capacity){
    this.elements = new String[capacity];
    this.size = 0;
  }

//  public void add(String element){
//    for(int i = 0; i <= this.elements.length; i++){
//      if(this.elements[i] == null){
//        this.elements[i] = element;
//        break;
//      }
//    }
//  }

//  public void add(String element) throws Exception{
//    if(this.size < this.elements.length){
//      this.elements[this.size] = element;
//      this.size++;
//    }else{
//      throw new Exception("Array is full");
//    }
//  }

  public boolean add(String element){
    if(this.size < this.elements.length){
      this.elements[this.size] = element;
      this.size++;
      return true;
    }
    return false;
  }

  public int size(){
    return this.size;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();

    s.append("[");

    for (int i=0 ; i<this.size-1; i++){
      s.append(this.elements[i]);
      s.append(" , ");
    }

    if(this.size > 0){
      s.append(this.elements[this.size-1]);
    }

    s.append("]");

    return s.toString();

  }
}
