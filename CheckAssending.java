package test;
import java.util.*;

public class CheckAssending {
	
	public static void main(String[] args) {
		
		int temp = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter the number of element you want : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter your element : ");
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}sc.close();
		
		for(int i = 0; i<arr.length-1;i++) {
			temp = arr[i+1];
			if(arr[i]>temp) {
				flag = false;
			}
		}
		System.out.println();
		if(flag==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
