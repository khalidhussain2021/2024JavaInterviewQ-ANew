package com.hussainIT;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlFileReadDisplay {
  
	public static void main(String[] args){
		try(InputStream input=HtmlFileReadDisplay.class.getClassLoader().getResourceAsStream("example.html")) {
			
				if(input==null) {
				 System.out.println("Unable to laod the .html file ");
				 return;
				}
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(input));
		StringBuilder content=new StringBuilder();
		String line;
		while((line=bufferedReader.readLine())!=null) {
			content.append(line).append("\n");
		}
		String html=content.toString();
		
		String title = extractValue(html,"<title>(.*?)</title>");
		System.out.println("Tilte "+title);
		
		String h1=extractValue(html,"<h1>(.*?)</h1>");
		System.out.println("h1 " +h1);
		
		String para=extractValue(html,"<p>(.*?)</p>");
		System.err.println("paragraph " + para);
		
	}catch (Exception e) {
		e.printStackTrace();
	}

	}

	private static String extractValue(String html, String regex ) {
		Pattern pattern=Pattern.compile(regex,Pattern.DOTALL);
		Matcher matcher=pattern.matcher(html);
		if(matcher.find()) {
			return matcher.group(1);
		}
		return null;
	}
}
