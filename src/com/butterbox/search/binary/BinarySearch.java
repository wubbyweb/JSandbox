package com.butterbox.search.binary;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BinarySearch {
	int binarySearch(int item, int[] list){
		int mid = 0, low = 0, high, index = -1;
		high = list.length - 1;
		
		
		
		while (high >= low){
		mid = (high + low) / 2;
		
		if (item < list[mid]){
			high = mid - 1;
		}else if (item > list[mid]){
			low = mid +1;
		}else{
			index = mid;
			break;
		}		
		}
		return index +1;
	}
	
	public static void main(String[] args){
		int[] itemlist = {2,6,9,12,16,18,23,26,29};
		
		BinarySearch bs = new BinarySearch();
		
		System.out.println(bs.binarySearch(29, itemlist));
		
		Calendar calDate = Calendar.getInstance();
		Date minDate = new Date(01/01/0001);
		
		calDate.setTime(minDate);
		System.out.println(calDate.getTime());
		
	}

}
