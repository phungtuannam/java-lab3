package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số lượng phần tử của mảng:");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Nhập phần tử:");
		for (int i = 0; i < size;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array ban đầu: " + Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array sắp xếp: " + Arrays.toString(a));
//		System.out.println("Max = " + a[a.length - 1]);
//		System.out.println("Min = " + a[0]);
		int max = a[0];
		for (int i = 0; i< a.length;i++) {
			max = Math.max(max,a[i]);
		}
		System.out.println("Max = " + max);
		int min = a[0];
		for (int i = 0; i< a.length;i++) {
			min = Math.min(min,a[i]);
		}
		System.out.println("Min = " + min);
	}
}
