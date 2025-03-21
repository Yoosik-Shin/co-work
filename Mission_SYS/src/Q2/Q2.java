package Q2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i <= N; i++) {
			if (i % 2 == 1) {
				int sum = 0;
				System.out.print(i + "+");
				sum += i;
				i++;
				System.out.print(sum);
			}
//			if (arr[i] % 2 == 0) {
//				
//			}
		}
		
		sc.close();
	}
	
}
