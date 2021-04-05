package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    @Test
    public void testFindPrimeNumbers(){
        int[] checkArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] answer = {2, 3, 5, 7};
        Array array = new Array(checkArray);
        ArrayLogic arrayLogic = new ArrayLogic();
        arrayLogic.findPrimeNumbers(array);
        boolean result = true;
        for (int i = 0; i < answer.length; i++){
            if (answer[i] != array.getItems()[i]){
                result = false;
                break;
            }
        }
        Assert.assertEquals(true, result);
    }

    @Test
    public void testExists(){
        int[] arrayBox = {1, 3, 7, 9999, 0, 17};
        int element = 17;
        Array array = new Array();
        array.setItems(arrayBox);
        ArrayLogic arrayLogic = new ArrayLogic();
        Assert.assertEquals(true, arrayLogic.exists(array, element));
    }

    @Test
    public void testFindMinNumber(){
        int[] arrayBox = {1, 3, 7, 9999, 0, 17};
        Array array = new Array();
        array.setItems(arrayBox);
        ArrayLogic arrayLogic = new ArrayLogic();
        Assert.assertEquals(0, arrayLogic.findMinNumber(array));
    }

    @Test
    public void testFindMaxNumber(){
        int[] arrayBox = {1, 3, 7, 9999, 0, 17};
        Array array = new Array();
        array.setItems(arrayBox);
        ArrayLogic arrayLogic = new ArrayLogic();
        Assert.assertEquals(9999, arrayLogic.findMaxNumber(array));
    }
}
