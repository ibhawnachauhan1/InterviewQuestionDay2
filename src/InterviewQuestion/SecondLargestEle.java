package InterviewQuestion;

import java.util.Arrays;

import java.util.Comparator;



public class SecondLargestEle {

	 public static  int SecondLargestElement ( int [] arr) {
		 
		 
		 
			int SecondLargestElement =  Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
			return SecondLargestElement;
		 }

	public static void main(String[] args) {
		int numbers[] = {12,4,35,65,77,65,87};
		System.out.println(SecondLargestElement(numbers));
	}

}
