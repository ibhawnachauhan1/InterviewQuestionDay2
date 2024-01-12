package InterviewQuestion;

import java.util.Arrays;

public class SecondSmallestEle {

	public static void main(String[] args) {
		int arr[] = {12,14,55,67,88,98};
		
     int secondSmallestElement = Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException());
     System.out.println("The second largest element is: "+ secondSmallestElement);
	}

}
