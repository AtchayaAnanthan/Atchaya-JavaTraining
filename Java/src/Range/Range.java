package Range;
import java.util.*;

public class Range
{


		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Number:");
			int num=scan.nextInt();
			if(num%2!=0)
			{
				System.out.println("Weird");
			}
			else if(num>=4 && num<=8)
			{
				System.out.println("Not Weird");
			}
			else if(num>=2 && num<=10)
			{
				System.out.println("Weird");
			}
			else if(num>=11)
			{
				System.out.println("Not Weird");
			}
			scan.close();

		}

	}