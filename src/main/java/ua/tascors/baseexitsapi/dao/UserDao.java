package ua.tascors.baseexitsapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.tascors.baseexitsapi.models.User;

public interface UserDao extends JpaRepository<User, Long> {
}
