package com.lunae.nutrivivi.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lunae.nutrivivi.auth.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
