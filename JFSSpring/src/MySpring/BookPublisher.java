package MySpring;

public class BookPublisher {
	public void distribution() {
		System.out.println(" im in the distribution method");
	}
	
	public void init() {
		System.out.println("lets initiate the bookpublisher");
	}
	
	public void destroy() {
		System.out.println("destroy the publisherbean");
	}
}