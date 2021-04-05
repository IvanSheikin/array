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
    
    public static Array bubbleSort(Array array) {
        int[] arrayBox = array.getItems();
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrayBox.length - 1; i++) {
                if (arrayBox[i] > arrayBox[i + 1]) {
                    temp = arrayBox[i];
                    arrayBox[i] = arrayBox[i + 1];
                    arrayBox[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        array.setItems(arrayBox);
        return array;
    }

    public static Array insertionSort(Array array) {
        int[] arrayBox = array.getItems();
        for (int i = 1; i < arrayBox.length; i++) {
            int current = arrayBox[i];
            int j = i - 1;
            while(j >= 0 && current < arrayBox[j]) {
                arrayBox[j+1] = arrayBox[j];
                j--;
            }
            arrayBox[j+1] = current;
        }
        array.setItems(arrayBox);
        return array;
    }

    public static Array selectionSort(Array array) {
        int[] arrayBox = array.getItems();
        for (int i = 0; i < arrayBox.length; i++) {
            int min = arrayBox[i];
            int minId = i;
            for (int j = i+1; j < arrayBox.length; j++) {
                if (arrayBox[j] < min) {
                    min = arrayBox[j];
                    minId = j;
                }
            }
            int temp = arrayBox[i];
            arrayBox[i] = min;
            arrayBox[minId] = temp;
        }
        array.setItems(arrayBox);
        return array;
    }
}
