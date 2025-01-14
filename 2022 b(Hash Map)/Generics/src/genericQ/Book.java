package genericQ;

public class Book <T, U>{
	
	private T booksTitle;
	private U bookIsbn;
	
	
	public Book(T booksTitle, U bookIsbn) {
		super();
		this.booksTitle = booksTitle;
		this.bookIsbn = bookIsbn;
	}


	public U getBookIsbn() {
		return bookIsbn;
	}
	
	

}
