public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book("Java Programming", "John Smith", 2022, 500);
        Magazine magazine = new Magazine("Masoud Makaram", "Various Authors", 2024, 3);
        DVD dvd = new DVD("The Matrix", "Wachowskis", 1999, "The Wachowskis", 136);

        book.displayInfo();
        System.out.println();
        magazine.displayInfo();
        System.out.println();
        dvd.displayInfo();
    }
}
