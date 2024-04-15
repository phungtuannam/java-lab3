package lab3;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào 1 số nguyên bất kỳ:");
		int x = sc.nextInt();
		
		for (int i = 1; i <= 10;i++) {
			System.out.printf("%d * %d = %d",x,i,i * x);
			System.out.println();
		}
		
		sc.close();
	}
}
