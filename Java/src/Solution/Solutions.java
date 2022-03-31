package Solution;

import java.util.Scanner;

public class Solutions
{


			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
	            MyCalculator calc = new MyCalculator();
	            int sum = calc.divisor_sum(num);
	            System.out.println(sum);
	         }
	}
