package project.book.exception;

public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(final String message) {
        super(message);
    }
}