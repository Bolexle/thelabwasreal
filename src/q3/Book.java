package q3;

/**
 * <p>This is an instance class that contains data about a book, that Bookshelf.java will be
 * able to access and change.</p>
 *
 * @author Alex Holmes
 * @version 1.0
 */
public class Book {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
	
	private String title, author, publisher;
	private int copywrightDate;
	
	public Book(String title, String author, String publisher, int copywrightDate) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copywrightDate = copywrightDate;
	}
	
	public Book() {
		title = "Nineteen Eighty-Four";
		author = "George Orwell";
		publisher = "Secker and Warburg";
		copywrightDate = 1949;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getCopywrightDate() {
		return copywrightDate;
	}
	
	public void setCopywrightDate(int copywrightDate) {
		this.copywrightDate = copywrightDate;
	}
	
	String description = "Title: " + title + "\n" +
				  "Author: " + author + "\n" +
				  "Publisher: " + publisher + "\n" +
				  "Copywright Date: " + copywrightDate;
	
	public String toString() {
		return ("Title: " + title + "\n" +
				"Author: " + author + "\n" +
			    "Publisher: " + publisher + "\n" +
				"Copywright Date: " + copywrightDate + "\n");
	}
};

