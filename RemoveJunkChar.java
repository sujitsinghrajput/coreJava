package com.sujit.removeJunkChar;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveJunkChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please given text to remove junk char");
		
		String text=sc.next();
		String textWithoutJunk = getOnlyString(text);
		System.out.println("Your new text is : "+textWithoutJunk);
		

	}

	
	public static String getOnlyString(String str) 
	{
		Pattern pattern=Pattern.compile("[^a-z A-Z]");
		
		Matcher matcher=pattern.matcher(str);
		String result=matcher.replaceAll("");
				
		return result;
	}
}
