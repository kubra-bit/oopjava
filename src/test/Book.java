package test;

public class Book {
	private String title;
	private String author;
	private int ISBN;
	public Book(String title,String author,int ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	public void getTitle(String title) {
		if(title==null || title.isEmpty()) {
			throw new IllegalArgumentException("Başlık boş olamaz!");
		}
        this.title=title;
	}
	
	public String setTitle() {
		return title;
	}
	public void getAuthor(String author) {
		this.author=author;
	}
	public String setAuthor() {
		return author;
	}
	public void getISBN(int ISBN) {
		this.ISBN=ISBN;
	}
	public int setISBN() {
		return ISBN;
	}
	@Override
	public String toString() {
		return "Kitap {"+
	           "title = "+title+ '\''+
	           "author = "+author + '\''+
	           "ISBN= "+ISBN+ '\''+
	           "}";
	}

}
