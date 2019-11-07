package ru.samplewebsite.userstestapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.samplewebsite.userstestapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
