package com.epam.training.array;

import java.util.ArrayList;

public class ArrayLogic {

    //TODO: write it using binary search
    public boolean exists(Array array, int element) {
        int[] arrayBox = new ArraySorter().sort(array).getItems();
        boolean helper = false;
        if (arrayBox != null) {
            int low = 0, high = arrayBox.length, mid;
            while (low < high) {
                mid = (low + high) >>> 1;
                if (element == arrayBox[mid]) {
                    helper = true;
                    break;
                } else {
                    if (element < arrayBox[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return helper;
    }

    public Array findPrimeNumbers(Array array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arrayBox = array.getItems();
        boolean b = true;
        for (int i = 1; i < arrayBox.length; i++) {
            if (arrayBox[i] == 1)
                list.add(1);
            else {
                for (int j = 2; j < arrayBox[i]; j++) {
                    if (arrayBox[i] % j == 0)
                        b = false;
                }
                if (b)
                    list.add(arrayBox[i]);
                else
                    b = true;
            }
        }
        int[] helper = new int[list.size()];
        for (int i = 0; i < helper.length; i++){
            helper[i] = list.get(i);
        }
        array.setItems(helper);
        return array;
    }

    public int findMinNumber(Array array){
        int min = array.getItems()[0];
        for (int i : array.getItems()){
            if (i < min)
                min = i;
        }
        return min;
    }

    public int findMaxNumber(Array array){
        int max = array.getItems()[0];
        for (int i : array.getItems()){
            if (i > max)
                max = i;
        }
        return max;
    }

    public Array findFibonacciNumbers(Array array){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : array.getItems()){
            boolean check = false;
            if (i == 1)
                check = true;
            else {
                int n0 = 1, n1 = 1, n2;
                for (int j = 3; j <= i; i++){
                    if (n0 + n1 == i)
                        check = true;
                    else {
                        n2 = n0 + n1;
                        n0 = n1;
                        n1 = n2;
                    }

                }
            }
            if (check)
                list.add(i);
        }
        int[] helper = new int[list.size()];
        for (int i = 0; i < helper.length; i++){
            helper[i] = list.get(i);
        }
        array.setItems(helper);
        return array;
    }
}
