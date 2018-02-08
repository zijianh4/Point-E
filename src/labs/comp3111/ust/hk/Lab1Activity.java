package labs.comp3111.ust.hk;

public class Lab1Activity {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		//Write your code here..
		for(int i = 0; i < 10; i++) {
			sum = sum + arr[i];
		}
		
		int Min = arr[0];
		for(int j = 1; j < 10; j++) {
			if(Min > arr[j]) {
				Min = arr[j];
			}
		}
		
		int Max = arr[0];
		for(int j = 1; j < 10; j++) {
			if(Max < arr[j]) {
				Max = arr[j];
			}
		}
		
		System.out.println(String.format("Sum of the number is %d", sum));
		System.out.println(String.format("Min = %d", Min));
		System.out.println(String.format("Max = %d", Max));
	}
}
