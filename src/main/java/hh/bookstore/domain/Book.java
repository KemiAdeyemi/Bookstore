package hh.bookstore.domain;

public class Book {

	private String title;
	private String author;
	private String isbn;
	private Double price;
	
	public Book(String title, String author, String isbn, Double price) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	public Book() {
		super();
		this.title = null;
		this.author = null;
		this.isbn = null;
		this.price = 0.00;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public Double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price + "]";
	}
	
	
	
}
