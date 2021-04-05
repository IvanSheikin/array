package com.epam.training.array;

public class ArraySorter {

    public Array sort(Array array) {
        int[] helper = array.getItems();
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < helper.length - 1; i++) {
                if (helper[i] > helper[i+1]) {
                    temp = helper[i];
                    helper[i] = helper[i+1];
                    helper[i+1] = temp;
                    sorted = false;
                }
            }
        }
        array.setItems(helper);
        return array;
    }
}
