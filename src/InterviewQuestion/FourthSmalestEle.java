package InterviewQuestion;

import java.util.Arrays;

public class FourthSmalestEle {

	public static int FourthSmallestLement (int [] arr) {
		
		int FourthSmallestLement = Arrays.stream(arr).sorted().skip(3).findFirst().orElseThrow(()-> new IllegalArgumentException("Array  Does not have a Fourth Largest Element "));
		
		return FourthSmallestLement;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {35,54,56,78,32,55};
		
		System.out.println(FourthSmallestLement(numbers));

	}

}
