package CoreJava;

class StudentData{						//Activity: Create an employee class with 
										//parameterized constructor
	 int sid;
	String sname;
	String dept;
	int mark;
	
StudentData(){} // constructor - without any arguments

StudentData(int sid,String sname){ 
	this.sname=sname;// constructor - with arguments
	System.out.println(sid+sname);
}
//	}
	
	StudentData(int id,String name,int m,String dep){ // constructor - with arguments
		
		this.sname=name;
		
		this.dept=dep;
		this.mark=m;
		this.sid=id;
		
		System.out.println(sid+sname+dept+mark);
		
	}
	
	public void displayProfile() {
		System.out.println("\n inside display profile");
	System.out.println(sid+sname);
	}
}

public class Student { //driver class

	public static void main(String[] args) {
		
		//StudentData sakthi=new StudentData(1,"sakthi Subramaniyan",100,"ECE");			
		//StudentData saranya=new StudentData(2,"saranya",100,"BCA");
//		sakthi.sid=100;
//		sakthi.mark=100;
//		sakthi.displayProfile();	
//		saranya.displayProfile();	
//		
		
		
		
		StudentData John=new StudentData(3,"New Entry");
		John.displayProfile();
//		
//		John.dept="ECE";
//		
//
////		sakthi.sid=1;
////		sakthi.sname="sakthi Subramaniyan";
////		sakthi.mark=100;
////		sakthi.dept="ECE";
//		
		
		}
}