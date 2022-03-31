package CoreJava;

import java.util.Scanner;

class LiveInputUsingScannerUtility{
		
	public void isEven(int a) {
		
		//int a=10;		
		if(a%2==0)
			System.out.println(a +"-->   is an even number");
		else
			System.out.println(a+"--> is not an even number");
		
	}
}
public class LiveInputUsingScanner {

	public static void main(String[] args) {
		
		LiveInputUsingScannerUtility obj=new LiveInputUsingScannerUtility();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to check even or odd:");
		int var=s.nextInt();
	System.out.println(" now enter a string:");
	String name=s.next();
System.out.println("hi"+name);
		obj.isEven(var);		
		s.close();
	}

}