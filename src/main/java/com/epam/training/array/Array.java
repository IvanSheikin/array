package com.epam.training.array;

import java.util.Arrays;


public class Array {

  private int[] items;

  public Array(){
  }

  public Array(int[] items) {
    this.items = items;
  }

  public int[] getItems() {
    return items;
  }

  public void setItems(int[] items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "Array{" +
            "items=" + Arrays.toString(items) +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Array array = (Array) o;
    return Arrays.equals(items, array.items);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(items);
  }
}
