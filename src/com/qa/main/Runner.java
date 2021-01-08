package com.qa.main;
import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	 public static void main(String[] args) {
		 
		 // question 1
		 
		 int firstArray[] = { 0,1,2,3,4,5,6,7,8,9 };
		 
		 for (int i = 0; i < firstArray.length; i++) {
			 System.out.println(firstArray[i]);
		 }
		 
		 // question 2
		 
		 List<Integer> secondArray = new ArrayList<Integer>();
		 
		 for (int i=0; i < 10; i++) {
			 secondArray.add(i);
			 System.out.println(secondArray);
		 }
		 
		 // question 3
		 
		 List<Integer> thirdArray = new ArrayList<Integer>();
		 
		 for (int i=0; i < 10; i++) {
			 thirdArray.add(i);
		 }
		 
		 for (int i=0; i < thirdArray.size(); i++) {
			 thirdArray.set(i, i*10);
		 }

		 System.out.println(thirdArray);
	 }
	 
}
