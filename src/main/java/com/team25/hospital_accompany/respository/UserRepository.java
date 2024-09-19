package com.team25.hospital_accompany.respository;


import com.team25.hospital_accompany.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
