package com.zipcodewilmington.assessment1.part2;
import java.util.*;
import java.util.Map.Entry;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int occuranceCounter = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                occuranceCounter++;
            }
        }
        return occuranceCounter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object removeValue(Object[] objectArray, Object objectToRemove) {
//
//        Integer removeIndex = objectToRemove;
//        for(Integer i = removeIndex; i < objectArray.length -1; i++) {
//            objectArray[i] = objectArray[i + 1];
//        }
//        //            return Arrays.toString(objectArray);
        return null;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1, tempCount;
        Object frequency = objectArray[0];
        Object temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if (temp == objectArray[j])
                    tempCount++;
            }
            if (tempCount > count) {
                frequency = temp;
                count = tempCount;
            }
        }
        return frequency;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Object[] objectArray) {

        int[] results = new int[objectArray.length];
        int frequency = Integer.MAX_VALUE;
        for (int i = 0; i < objectArray.length; i++) {
            for (int j = 0; j < objectArray.length; j++) {
                if (objectArray[j] == objectArray[i]) {
                    results[i]++;
                }
            }
            if (results[i] <= frequency) {
                frequency = results[i];
            }
        }
        for (int i = 0; i < results.length; i++) {
            if (results[i] == frequency) {
            }
        }
        return frequency;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {

        int[] array1and2 = new int[objectArray.length + objectArrayToAdd.length];
        System.arraycopy(objectArray, 0, array1and2, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd, 0, array1and2, 0, objectArrayToAdd.length);
        return null;
    }
}