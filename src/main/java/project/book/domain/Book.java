package project.book.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Book {

    @Id
    @NotNull
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;


    @NotNull
    @Column(name = "isbn",nullable = false)
    private String isbn;

    @NotNull
    @Size(max = 64)
    @Column(name = "author", nullable = false)
    private String author;

    @NotNull
    @Size(max = 64)
    @Column(name = "title", nullable = false)
    private String title;

    public Book() {
    }

    public Book(final Long id, final String author, final String title) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
