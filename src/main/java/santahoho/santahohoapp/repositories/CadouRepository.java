package santahoho.santahohoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import santahoho.santahohoapp.models.Cadou;
import santahoho.santahohoapp.models.Copil;

public interface CadouRepository extends JpaRepository<Cadou, Integer>  {
}
