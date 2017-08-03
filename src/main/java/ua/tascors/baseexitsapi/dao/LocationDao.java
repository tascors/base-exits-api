package ua.tascors.baseexitsapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.tascors.baseexitsapi.models.Location;

public interface LocationDao extends JpaRepository<Location, Long> {
}
