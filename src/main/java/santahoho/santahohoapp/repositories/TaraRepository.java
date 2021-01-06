package santahoho.santahohoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import santahoho.santahohoapp.models.Copil;
import santahoho.santahohoapp.models.Tara;

public interface TaraRepository extends JpaRepository<Tara, Integer>  {
}
