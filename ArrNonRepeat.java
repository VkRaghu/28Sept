package test;

import java.util.Scanner;

public class ArrNonRepeat {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int []ar = new int[n];
		System.out.println("Enter Array Element : ");
		for(int i = 0; i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
        int count;   
		for(int i = 0; i<ar.length;i++) {
			count = 0;
			for(int j = 0; j<ar.length;j++) {
				if((ar[i]==ar[j]) && (i!=j)) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(ar[i]);
		 }
		}
		
	}


}
