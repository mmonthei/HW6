
package model;

public class Books {
    
    private int bookID;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private int bookRating;
    private String bookOwn;
    private String bookRead;

    
    public Books() {
        this.bookID = 0;
        this.bookTitle = "";
        this.bookAuthor = "";
        this.bookPublisher = "";
        this.bookRating = 0;
        this.bookOwn = "";
        this.bookRead = "";
    }
    
    public Books(int bookID, String bookTitle, String bookAuthor, String bookPublisher, int bookRating, String bookOwn, String bookRead) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookRating = bookRating;
        this.bookOwn = bookOwn;
        this.bookRead = bookRead;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getBookRating() {
        return bookRating;
    }

    public void setBookRating(int bookRating) {
        this.bookRating = bookRating;
    }

    public String getBookOwn() {
        return bookOwn;
    }

    public void setBookOwn(String bookOwn) {
        this.bookOwn = bookOwn;
    }

    public String getBookRead() {
        return bookRead;
    }

    public void setBookRead(String bookRead) {
        this.bookRead = bookRead;
    }

    @Override
    public String toString() {
        return "Books{" + "bookID=" + bookID + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookPublisher=" + bookPublisher + ", bookRating=" + bookRating + ", bookOwn=" + bookOwn + ", bookRead=" + bookRead + '}';
    }
      
}
