package com.hussainIT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapKeyAverageofList {

	public static void main(String[] args) {
		
		Map<String,List<Integer>> data=new HashMap<>();
		data.put("Group1",Arrays.asList(1, 2, 3, 4));
		data.put("Group2",Arrays.asList(5, 6, 7, 8));
		data.put("Group3",Arrays.asList(5, 6, 7, 8));
		 Map<String, Double> groupAverages = data.entrySet().stream()
		            .collect(Collectors.toMap(
		                Map.Entry::getKey,  // Group name (key)
		                entry -> entry.getValue().stream()  // Group values (list)
		                              .mapToInt(Integer::intValue)
		                              .average()
		                              .orElse(0.0)  // Default if list is empty
		            ));
		        
		        // Print each group's average
		        groupAverages.forEach((group, avg) -> 
		            System.out.println("The average for " + group + " is: " + avg));
				     
	}

}
