package santahoho.santahohoapp.repositories;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import santahoho.santahohoapp.models.Copil;

public interface CopilRepository extends JpaRepository<Copil, Integer> {
}
