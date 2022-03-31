package MySpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
		BookStore book2=(BookStore)context.getBean("bookbean");
		book2.setprice(3000);		
		BookStore book1=(BookStore)context.getBean("bookbean");
		book1.Bookprice();
		System.out.println(book1);  //if we give prototype both values of book will differ
		                            //in singleton both will be same
		
		
		book2.Bookprice();
		System.out.println(book2);
		
		
		
		
		// TODO Auto-generated method stub
	//	@SuppressWarnings
		
		((AbstractApplicationContext)context).registerShutdownHook();
		//BookStore bookStore = (BookStore)context.getBean("bookstore");
	//	BookPublisher bookpublisher = (BookPublisher)context.getBean("bookpublisher");
		//bookStore.sales();
     	//bookpublisher.distribution();
     	//bookpublisher.purchase();
	//Book book=(Book)context.getBean("bookbean");
	//book.bookId();
	//book.bookName();
	//book.Bookprice();
	//book.authorName();
	
	
	}

}