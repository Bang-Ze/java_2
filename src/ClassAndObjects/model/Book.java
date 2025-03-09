package ClassAndObjects.model;


import java.time.Instant;
import java.util.*;

public class Book {
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private Date publishedDate;
    private Set<String> authors;
    //
    public void setBookInfo(Integer id,
                             String bUuid,
                             String bTitle,
                             String bDescription,
                             Date bPublishedDate,
                             Set<String> bAuthors) {
        this.id = id;
        this.uuid = bUuid;
        this.title = bTitle;
        this.description = bDescription;
        this.publishedDate = bPublishedDate;
        this.authors = bAuthors;
    }
    public void getBookInfo(){
        System.out.println("Book ID: " + this.id);
        System.out.println("Book UUID: " + this.uuid);
        System.out.println("Book title: " + this.title);
        System.out.println("Book description: " + this.description);
        System.out.println("Book publishedDate: " + this.publishedDate);
        System.out.println("Book authors: " + this.authors);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                "\n, uuid='" + uuid + '\'' +
                "\n, title='" + title + '\'' +
                "\n, description='" + description + '\'' +
                "\n, publishedDate=" + publishedDate +
                "\n, authors=" + authors +
                '}';
    }
}
