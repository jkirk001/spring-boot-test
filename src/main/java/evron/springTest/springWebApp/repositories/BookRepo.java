package evron.springTest.springWebApp.repositories;

import evron.springTest.springWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
