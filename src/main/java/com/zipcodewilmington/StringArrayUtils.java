package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        int tracker = 0;
        for (String s : array) {
            if (value.equals(s)) {
                tracker++;
            }
        }
        return (tracker > 0);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> reverseArray = new ArrayList<String>();

        for(int i = array.length-1; i >= 0; i--){
            reverseArray.add(array[i]);
        }
         //System.out.println(reverseArray);
        //this works if you don't need the og array,
        // alternatively create an array of equal size to the array list
        // then throw that into the toArray method so
        // String[] rArray = new String[reverseArray.size-1];
        // rArray = reverseArray.toArray(rArray);
        return reverseArray.toArray(array);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        ArrayList<String> reverseArray = new ArrayList<String>();

        for(int i = array.length-1; i >= 0; i--){
            reverseArray.add(array[i]);
        }

        String[] rArray = new String[reverseArray.size()-1];
        rArray = reverseArray.toArray(rArray);

        return (Arrays.compare(array,rArray) == 0);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sentence = new StringBuilder();
        int tracker = 0;

        for(String s:array){
            sentence.append(s);
        }

        String arrayContent = sentence.toString().toLowerCase();
        System.out.println(arrayContent);

        for(int i =0; i <= 25; i++){
            if(arrayContent.contains(String.valueOf(alpha.charAt(i)))){
                tracker++;
            }
        }
        System.out.println(tracker);

        return (tracker == 26);
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
