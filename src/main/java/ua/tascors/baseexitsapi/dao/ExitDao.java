package ua.tascors.baseexitsapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.tascors.baseexitsapi.models.Exit;

public interface ExitDao extends JpaRepository<Exit, Long> {
}
