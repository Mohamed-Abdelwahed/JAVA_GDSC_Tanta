public abstract class LibraryResource {
   
    protected String title;
    protected String author;
    protected int publicationYear;

    public LibraryResource(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public abstract void displayInfo();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}