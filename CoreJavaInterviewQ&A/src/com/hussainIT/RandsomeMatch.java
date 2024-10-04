package com.hussainIT;

import java.util.HashMap;

public class RandsomeMatch {
	public static void main(String[] args) {
		System.out.println(randomSome("khalidhussain", "jalalbad"));
		System.err.println(randomSomeCon("i love code","leetcode"));
	}
	
	//time complexity O(n*m)
	//space complexity O(m)
	public static boolean randomSome(String randsomeNode ,String magazine) {
		for(int i=0;i<randsomeNode.length();i++) {
			char r=randsomeNode.charAt(i);
			int matchingIndex = magazine.indexOf(r);
			if(matchingIndex==-1) {
				return false;
			}
			magazine=magazine.substring(0,matchingIndex)+magazine.substring(matchingIndex+1);
		}
		
		return true;
	}
	
	//time complexity 
	// space complexity 
	public static boolean randomSomeCon(String randomeNode,String magazine) {
		HashMap<Character,Integer> magzineLetter=new HashMap<>();
		for(int i=0;i<magazine.length();i++) {
			char m=magazine.charAt(i);
			Integer currentCount = magzineLetter.getOrDefault(m, 0);
			magzineLetter.put(m, currentCount +1);
		}
		for(int i=0;i<randomeNode.length();i++) {
			char r=randomeNode.charAt(i);
			Integer crrentCount = magzineLetter.getOrDefault(r,0);
			if(crrentCount==0) {
				return false;
			}
			magzineLetter.put(r,crrentCount-1);
		}
		return true;
	}
}
