package ClassAndObjects;

import ClassAndObjects.model.Book;

import java.sql.Date;
import java.time.Instant;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;

public class BookAssignment {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookInfo(1, UUID.randomUUID().toString(), "Tom and Jerry", "This is cartoon book.", Date.from(Instant.now()), new TreeSet<>(List.of("ze", "zo")));
        book1.getBookInfo();
    }
}