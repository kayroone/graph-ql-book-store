package de.jwiegmann.bookstore.domain.repository;

import de.jwiegmann.bookstore.domain.book.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
