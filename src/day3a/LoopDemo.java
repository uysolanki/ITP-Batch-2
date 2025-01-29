package day3a;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		int strength = 5;
		int target = 50;
		int arr[] = new int[strength - 1];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int k = 0;
		int rno;
		for (rno = 1; rno <= strength; rno++) {
			System.out.println("Rno " + rno + "How many chocolates have you bought?");
			int choc = sc.nextInt(); // 60
			if ((rno % 2 == 1 && choc % 2 == 0) || (rno % 2 == 0 && choc % 2 == 1))
				sum += choc;
			else {
				arr[k] = rno;
				k++;
				continue;
			}

			if (sum >= target)
				break;
		}

		while ((rno + 1) <= strength) {
			arr[k] = rno + 1;
			rno++;
			k++;
		}
		System.out.println("Chocolates Deposited with Principal " + (target));
		System.out.println("Extra Chocolates  " + (sum - target));

		System.out.println("Non Contributing Students  ");
		for (int n : arr) {
			if (n != 0)
				System.out.print(n + "\t");
		}
	}

}
