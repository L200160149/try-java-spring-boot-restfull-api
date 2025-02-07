package dewaning.try_spring_restful_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dewaning.try_spring_restful_api.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    // User findByUsername(String username);
    Optional<User> findFirstByToken(String token);
}
