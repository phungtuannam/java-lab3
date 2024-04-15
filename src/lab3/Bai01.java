package lab3;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào 1 số nguyên:");
		int value = sc.nextInt();
		
		int count = 0;
		for(int i = 2; i <= value - 1;i++) {
			if(value % i == 0) {
				System.out.println("Các ước khác là: " + i);
				count++;
			}
		}
		
		if(count == 0) {
			System.out.printf("%d là số nguyên tố",value);
		}
		else {
			System.out.printf("%d không phải là số nguyên tố",value);
		}
		
		sc.close();
	}
}
