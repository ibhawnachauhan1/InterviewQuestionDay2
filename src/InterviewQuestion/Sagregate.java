package InterviewQuestion;

public class Sagregate {
    //Sagregate 0's and 1's.
	public static void main(String[] args) {
		//int[] Array = new int [8];
		int arr[] = {0,1,1,0,1,1,0,0};
		int j=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==0) {
				arr[j++] = arr[i];
			
				
			}
		}
		while(j<arr.length) {
			arr[j++] = 1;
		}
		for(int k=0; k<arr.length;k++) {
			System.out.print(arr[k] + "  ");
		}

	}

}
