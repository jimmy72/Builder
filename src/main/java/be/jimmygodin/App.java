package be.jimmygodin;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Book book = new Book.Builder()
                .withTitle("Learning Java")
                .withAuthor( new Author.Builder()
                        .withFirstName("Jimmy")
                        .withLastName("Godin")
                        .createAuthor())
                .withPublishDate(LocalDate.now())
                .withPageCount(268)
                .createBook();

        System.out.println(book);

    }
}
