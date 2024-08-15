package com.hussainIT;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CititusTech {

	public static void main(String[] args) {
		String str="applets";
		String longestNonRepeatingSubstring = findLongestNonRepeatingSubstring(str);
	    	    
	    String longestNonRepeatingSubstring1 = findLongestNonRepeatingSubstring1(str);
	    System.out.println(	10+20+"World"+20+10); 
	    

	}
	
	public static String findLongestNonRepeatingSubstring1(String str) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int longestStart = 0;

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestStart = start;
            }
        }

        return str.substring(longestStart, longestStart + maxLength);
    }
	
	
	public static String findLongestNonRepeatingSubstring(String str) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int[] longestSubstringInfo = IntStream.of(0, 0).toArray(); // Array to store maxLength and start index

        IntStream.range(0, str.length()).forEach(end -> {
            char currentChar = str.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                int start = Math.max(longestSubstringInfo[1], charIndexMap.get(currentChar) + 1);
                longestSubstringInfo[1] = start; // Update start
            }

            charIndexMap.put(currentChar, end);

            if (end - longestSubstringInfo[1] + 1 > longestSubstringInfo[0]) {
                longestSubstringInfo[0] = end - longestSubstringInfo[1] + 1; // Update maxLength
                longestSubstringInfo[1] = longestSubstringInfo[1]; // Update start index
            }
        });

        return str.substring(longestSubstringInfo[1], longestSubstringInfo[1] + longestSubstringInfo[0]);
    }

	
	
//	public void doCall(int a, int b){
//		if(a>b)
//			call(a,b);
//		else
//			call(b,a);
	
//	}	
	/*
	 * import org.mockito.MockitoAnnotations;
	 * 
	 * class MyClassTest {
	 * 
	 * @Mock private MyClass myClass;
	 * 
	 * @BeforeEach void setUp() { MockitoAnnotations.openMocks(this); }
	 * 
	 * @Test void testDoCall() { // Create an instance of the class that contains
	 * the doCall method MyClass instance = spy(new MyClass());
	 * 
	 * // Test case where a > b instance.doCall(5, 3); verify(instance).call(5, 3);
	 * 
	 * // Test case where b > a instance.doCall(2, 4); verify(instance).call(4, 2);
	 * } }
	 */

}
