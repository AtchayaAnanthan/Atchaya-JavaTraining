package JFS.BookShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBook {
	@Autowired
	MyFavoBook myFavoBook;
	@Autowired
	MyFirstBookImpl myFirstBookImpl;
	@Autowired
	@Qualifier("myFavoBook")
	MyFirstBookInterface myfirstBookInterface;
	
	public MyFavoBook getMyFavBooks() {
		return myFavoBook;
	}
	
	public void setMyFavBooks(MyFavoBook myFavBooks) {
		this.myFavoBook=myFavoBook;
	}
	
	public void displayMyBook() {
		
		System.out.println("My Book Name is: Java 11");
		myFavoBook.myFavbk();
		myFavoBook.my1stBook();
		myFirstBookImpl.my1stBook();
		myfirstBookInterface.my1stBook();
	}
	public Integer artistCount() {
		Integer artist=100;
		return artist;
	}
	public void my1stBook() {
		
	}
	
	

}