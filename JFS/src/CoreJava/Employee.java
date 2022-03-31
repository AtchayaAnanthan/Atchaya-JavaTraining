package CoreJava;

public class Employee {
	
	//Method overloading
	public void show()
	{
		System.out.println("show without arg");
	}

	
	public void show(int a) //method prototype
	{
		System.out.println("show with int arg");
	}
	
	public void show(char c)
	{
		System.out.println("show with char arg");
	}
	
	
	public static void main(String[] args) {
		Employee obj=new Employee();
	new Employee().show();
	new Employee().show(5);
	new Employee().show('c');
				
		obj.show();//method calling/ function calling
				
		//call by value
		obj.show(10);//function calling
		obj.show('x');
	}

}