public class DVD extends LibraryResource {
    private String director;
    private int duration; 

    public DVD(String title, String author, int publicationYear, String director, int duration) {
        super(title, author, publicationYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Duration: " + duration + " minutes");
    }

    public void play() {
    }

    public void stop() {
    }
}