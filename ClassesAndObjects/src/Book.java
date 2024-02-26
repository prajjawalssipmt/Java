public class Book {

    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks =0;
    }
    {
        totalBooks++;
    }

    Book(String isbn , String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn , "Unknown","Uknown");
    }

    static int getTotalBooks(){
        return  totalBooks;
    }

    void borrowedBook(){
        if (isBorrowed){
            System.out.println("Book already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy "+this.title);
        }
    }
    void returnBook(){
        if (isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed , plz leave a review");
        }else {
            System.out.println("This book is in the library");
        }
    }

    public static void main(String[] args) {
        Book designTHing = new Book("1","Design","Prajjawal");
        Book myBook = new Book("3");
        System.out.println(getTotalBooks());
        designTHing.borrowedBook();
        myBook.borrowedBook();
        myBook.returnBook();
        designTHing.borrowedBook();
        designTHing.returnBook();
        designTHing.returnBook();
    }
}
