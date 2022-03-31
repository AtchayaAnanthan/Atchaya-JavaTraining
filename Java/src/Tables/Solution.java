package Tables;



import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Value");
		int A=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int value=A*i;
			System.out.println(A+"*"+i+"="+value);
		}
		sc.close();}}
	