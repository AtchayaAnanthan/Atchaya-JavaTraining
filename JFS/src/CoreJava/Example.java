package CoreJava;

class ExampleUtility{
	public static void tables(int y)
	{
		for(int i=1;i<11;i++)
				System.out.println(y*i);
	}
		
	public  void operations(int a,int b)  //Parameterized Method // behaviour // functions  // function definition
	{	
		//int a=7,b=8;				// variables / properties
		
		System.out.println(b-a);
		System.out.println(b*a);
	}
	
	public  int addition(int a,int b)  //Parameterized Method // behaviour // functions  // function definition
	{	
		return(a+b);
	}
	
	public int subtraction(int a,int b)  //Parameterized Method // behaviour // functions  // function definition
	{	
		return(a-b);
	}
	
}

public class Example {
//	public  static void tables(int y)
//	{
//		for(int i=1;i<11;i++)
//				System.out.println(y*i);
//	}
	
	
	public static void main(String args[])  //Driver Class
	{
		ExampleUtility obj1=new ExampleUtility();
		
		ExampleUtility obj2=new ExampleUtility();
		
		System.out.println("Obj1 is in progress");
		int res1=obj1.addition(7,8);		// calling the function
		System.out.println("Result of addition by obj1 is "+res1);

		System.out.println("Result of sub by obj1 is"+ obj1.subtraction(5,3));
		System.out.println("Result of mul by obj1 is");
		//obj1.tables(4);
//		tables(6);
		ExampleUtility.tables(7);
		
		
		System.out.println("Obj2 is in progress");
		int res2=obj2.addition(5,4);		// calling the function
		System.out.println("Result of addition by obj2 is  "+res2);

		System.out.println("Result of sub by obj1 is"+obj2.subtraction(7,3));
		System.out.println("Result of mul by obj2 is");
		//obj2.tables(8);

	}

}