package com.epam.training.array;

import java.util.ArrayList;

public class ArrayLogic {

  
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
        int n0 = 1;
        int n1 = 1;
        int n2;
        ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        fibonacciNumbers.add(1);
        for(int i = 3; i <= findMaxNumber(array); i++){
            n2=n0+n1;
            fibonacciNumbers.add(n2);
            n0=n1;
            n1=n2;
        }
        for(int i = 0; i < fibonacciNumbers.size(); i++){
            for (int j : array.getItems()){
                if (fibonacciNumbers.get(i) == j){
                    res.add(fibonacciNumbers.get(i));
                }
            }
        }
        int[] helper = new int[res.size()];
        for (int i = 0; i < helper.length; i++){
            helper[i] = res.get(i);
        }
        array.setItems(helper);
        return array;
    }
}
