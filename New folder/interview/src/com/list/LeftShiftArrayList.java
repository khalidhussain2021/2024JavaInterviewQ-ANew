 package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftShiftArrayList {
	public static void main(String[] args) {
        List<Character> list = new ArrayList<>(Arrays.asList('a', 'b', 's', 'd', 'e', 'f', 'g', 'h'));

        // Perform left shift
        leftShift(list);

        // Print the shifted list
        System.out.println("Shifted list: " + list);
    }

    public static void leftShift(List<Character> list) {

        // Store the first element to move it to the end later
        char firstElement = list.get(0);

        // Shift elements to the left
        for (int i = 1; i < list.size(); i++) {
            list.set(i - 1, list.get(i));
        }

        // Move the first element to the end
        list.set(list.size() - 1, firstElement);
    }

}
