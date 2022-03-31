package Person;

public class PersonDriverClass {
	
	public static void main(String args[]) {
	
		PersonInfo obj=new PersonInfo();
		obj.fname="Atchu";
		obj.lname="A";
		//obj.age=10;
		obj.setFname(10);
		System.out.println("age="+obj.getAge());
		obj.show();
		//obj.display();
		
		System.out.println(obj);
		
	
	}

}