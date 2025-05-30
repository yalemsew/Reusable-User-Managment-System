package org.example.userprofilems.repository;

import org.example.userprofilems.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    void deleteByUsername(String username);
}

//jpa query method for update, it should be transactional
