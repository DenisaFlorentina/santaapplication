package santahoho.santahohoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import santahoho.santahohoapp.models.Copil;
import santahoho.santahohoapp.models.User;

public interface UserRepository extends JpaRepository<User, Integer>  {
}
