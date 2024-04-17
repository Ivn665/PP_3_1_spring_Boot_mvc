package web.repository;

import org.springframework.stereotype.Repository;
import web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

