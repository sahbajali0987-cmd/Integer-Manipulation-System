package myPack;

import java.util.Scanner;

public class IntegerManioulationSystem {

	public static void main(String[] args) {

		System.out.println("Which operations you want to perform");
		System.out.println(
				"1.Check even odd\n2.Count digit\n3.To find factorial\n4.Check palindrome\n5.Smallest and largest digit\n6.Reverse digit\n7.Count digits\n8.Check prime number");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter first number:");
			int num1 = sc.nextInt();
			if (num1 % 2 == 0) {
				System.out.println(num1 + " " + "Even Number");
			} else {
				System.out.println(num1 + " " + "Odd Number");
			}

			System.out.println("Do you want to see even number from 1 to n");
			String response = sc.next();

			if (response.equalsIgnoreCase("yes")) {
				for (int i = 1; i <= num1; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
			} else {
				System.out.println("Invalid");
			}
			break;
		case 2:
			int digit;
			System.out.println("Enter the number");
			num1 = sc.nextInt();
			int count = 0;
			int i = 0;
			while (i < num1) {
				digit = num1 % 10;
				count++;
				num1 /= 10;
			}
			System.out.println("Total Number of digits is" + " " + count);

			System.out.println("Do you want to sum the digits");
			response = sc.next();

			if (response.equalsIgnoreCase("yes")) {
				System.out.println("Enter the number");
				int number = sc.nextInt();

				int sum = 0;
				int j = 0;
				while (j < number) {
					int dgi = number % 10;
					sum += dgi;
					number /= 10;
				}
				System.out.println("Sum of digits is" + " " + sum);
			}
			break;
		case 3:
			System.out.println("Enter the number");
			int fah = sc.nextInt();

			int fact = 1;
			for (i = 1; i < fah;) {
				i++;
				fact *= i;

			}
			System.out.println("Factorial of" + " " + fah + " " + "is" + " " + fact);
			break;
		case 4:
			int dig;
			System.out.println("Enter your number here:");
			int a = sc.nextInt();
			int ori = a;
			int rev = 0;
			while (a > 0) {
				dig = a % 10;
				rev = rev * 10 + dig;
				a /= 10;
			}
			if (rev == ori) {
				System.out.println(ori + " " + "is" + " " + " " + "Palindrome Number");
			} else {
				System.out.println("Not a Plaindrome Number");
			}

			System.out.println("Do you want to see the palindrome number from 1 - n");
			response = sc.next();
			if (response.equalsIgnoreCase("yes")) {
				System.out.println("Enter your number here");
				int n = sc.nextInt();
				int cont = 0;
				for (int j = 0; j < n; j++) {
					int orig = j;
					int revs = 0;
					while (orig > 0) {
						int digis = orig % 10;
						revs = revs * 10 + digis;
						orig /= 10;
					}
					if (j == revs) {
						cont++;
						System.out.println(j);
					}
				}
				System.out.println("Total numbers of palindrome are" + " " + cont);
			}
			break;
		case 5:
			System.out.println("Enter the number");
			int x = sc.nextInt();
			int largest = 0;
			int d;
			while (x > 0) {
				d = x % 10;
				if (d > largest) {
					largest = d;
				}
				x /= 10;

			}
			System.out.println(largest);

			System.out.println("Do you want to find the smallest digit");
			response = sc.next();
			System.out.println("Enter the number");
			int y = sc.nextInt();

			if (response.equalsIgnoreCase("yes")) {
				int smallest = 9;
				while (y > 0) {
					int didi = y % 10;
					if (didi < smallest) {
						smallest = didi;
					}
					y /= 10;
				}
				System.out.println(smallest);
			}
			break;
		case 6:
			System.out.println("Enter the number here:");
			int z = sc.nextInt();
			int o = 0;
			int haha = 0;
			int k = 0;
			while (o < z) {
				haha = z % 10;

				z /= 10;
				System.out.print(haha);
			}
			System.out.println();
			break;
		case 7:
			System.out.println("Enter the number");
			int s = sc.nextInt();
			int w = 0;
			int kount = 0;
			while (w < s) {
				int tigit = s % 10;
				kount++;
				s /= 10;
			}
			System.out.println(kount);
			break;
		case 8:
			System.out.println("Enter your number here:");
			int nume = sc.nextInt();
			int kou = 1;
			for (int t = 1; t < nume; t++) {
				if (nume % t == 0) {
					kou++;
				}
			}
			if (kou == 2) {
				System.out.println("Prime  Number");
			} else {
				System.out.println("Not Prime Number");
			}

			System.out.println("Do you want prime number from 1-n");
			response = sc.next();

			if (response.equalsIgnoreCase("yes")) {

				System.out.println("Enter your number here:");
				nume = sc.nextInt();
				int coco = 0;
				for (int m = 1; m <= nume; m++) {
					kou = 0;
					for (int t = 1; t <= m; t++) {
						if (m % t == 0) {
							kou++;
						}
					}
					if (kou == 2) {
						coco++;
						System.out.println(m);
					}

				}
				System.out.println("Total Number of prime number from 1-n are" + " " + coco);

			}
			break;
		default:
			System.out.println("Invalid Choice");

		}

	}

}
