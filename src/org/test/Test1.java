package org.test;

import org.junit.Test;

public class Test1 {
	
	@Test
	public void testcase1(){
		String  testString = "Hello this is assignment to get largest string value";
		String[] testStringSplittedArray = testString.split(" ");
		String mostWordInString = "";
		for(String testArraySplitArrayValue : testStringSplittedArray){
			if(testArraySplitArrayValue.length() > mostWordInString.length()){
				mostWordInString = testArraySplitArrayValue;
			}
		}
		
		System.out.println("Highest Letter Word : " + mostWordInString + "["+mostWordInString.length()+" Letter(s)]");
	}
	
}
