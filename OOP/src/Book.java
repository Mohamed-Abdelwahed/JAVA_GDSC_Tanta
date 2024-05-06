public class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int publicationYear, int pageCount) {
        super(title, author, publicationYear);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Page Count: " + pageCount);
    }

    public void borrowBook() {
    }

    public void returnBook() {
    }
}
