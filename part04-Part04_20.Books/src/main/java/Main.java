import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        
        System.out.print("What information will be printed? ");
        String query = scanner.nextLine();
        
        if (query.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else if (query.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
