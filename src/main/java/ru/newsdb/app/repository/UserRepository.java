package ru.newsdb.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.newsdb.app.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

