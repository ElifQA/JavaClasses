package TaskConstructor;

public class BookClass {
	/*
	 * Write program as a Book class that will have 2 Constructors. While creating
	 * an object make sure: Instance variables are being initialized Both
	 * Constructors are being executed
	 */
	String title, author;
	int publish;
	static int pages;

	public BookClass(String title, String author, int publish) {
		this.title = title;
		this.author = author;
		this.publish = publish;

	}

	public BookClass(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void display() {
		System.out.println("Book: " + title + " Author: " + author + " published in " + publish);
	}

	public static void main(String[] args) {
		BookClass book1 = new BookClass("Harry Potter and The Goblet of Fire", "JK Rowling", 2000);
		BookClass book2 = new BookClass("Crime and Punishment", "Fyodor Dostoyevsky", 1866);
		book1.display();
		book2.display();
	}

}
