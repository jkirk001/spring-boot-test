package evron.springTest.springWebApp.repositories;

import evron.springTest.springWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long>{
}
