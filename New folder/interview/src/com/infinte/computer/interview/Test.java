package com.infinte.computer.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 8, 6, 7, 8);
        List<List<Integer>> output = alternateSublists(list);
        System.out.println(output); // Output: [[1, 5, 7], [2, 8, 6, 8]]
    }

    public static List<List<Integer>> alternateSublists(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        	result.add(new ArrayList<>()); 
            result.add(new ArrayList<>());

        for (int i = 0; i < list.size(); i++) {
            result.get(i % 2).add(list.get(i));
        }

        return result;
    }
}
