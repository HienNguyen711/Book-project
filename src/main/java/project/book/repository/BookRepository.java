package project.book.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.book.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}