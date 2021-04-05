package com.epam.training.array;

import org.junit.Test;
import org.junit.Assert;

public class ArraySorterTest {

   
    @Test
    public void testSortShouldSortWhenPositiveNumbers(){
        ArraySorter arraySorter = new ArraySorter();
        Array array = new Array();

        int[] testArray = {1, 3, 5, 6, 3, 3, 4, 4 ,5555, 2, 0, 435, 34, 23,11};
        array.setItems(testArray);
        arraySorter.sort(array);
        testArray = array.getItems();

        boolean result = true;

        for (int i = 0; i < testArray.length - 1; i++){
            if (testArray[i] > testArray[i+1])
                result = false;
        }
        Assert.assertEquals(true, result);
    }

    //TODO: add tests for other positive and negative scenarios

}
