package CoreJava;


 class Modifier{
	int sid;
	String sname;
	String dept;
	int mark;
	
	
	
	
	Modifier(){
		
		displayProfile();
	}
	
	public void displayProfile() {
		System.out.println("i'm inside display profile method of Modifier class");
	}
}

public class AccessModifiers {
public static void main(String[] args) {
		
	Modifier sakthi=new Modifier();			
	Modifier saranya=new Modifier();	
	sakthi.displayProfile();	
	saranya.displayProfile();
	
		}
}