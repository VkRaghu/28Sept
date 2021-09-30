package test;
import java.util.*;

public class TwoSum {
	
	public static void main(String[] args) {
		
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter the number of element you want : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter your element : ");
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter your target value : ");
		int target = sc.nextInt();
		sc.close();
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(target==arr[i]+arr[j]) {
					flag=true;
				}
			}
			
		}if(flag==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	
	}
	

}
