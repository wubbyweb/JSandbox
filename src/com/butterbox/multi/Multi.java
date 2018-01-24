/**
 * Compare and confirm the uniqueness of the given string
 */
package com.butterbox.multi;

import java.util.ArrayList;

public class Multi {
	
	// Is characters in a string unique\
	public static void main(String args[]){
		String string = "abbcd";
		ArrayList<Integer> valueBucket = new ArrayList<Integer>();
		String status = "Unique";
		
		for(int i=0;i<string.length();i++){
			
			System.out.println(string.charAt(i));
			
			if(valueBucket.contains((int) string.charAt(i))){
				status = "Not Unique";
				break;
			}else{
				valueBucket.add((int)string.charAt(i));
			}
						
		}
		System.out.println(status);
	}

}
