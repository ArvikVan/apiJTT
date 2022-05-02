package arv.apijtt.repo;

import arv.apijtt.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
public interface ClientRepo extends JpaRepository<Clients, Long> {
}
