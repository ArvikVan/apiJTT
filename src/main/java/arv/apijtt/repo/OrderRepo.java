package arv.apijtt.repo;

import arv.apijtt.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
public interface OrderRepo extends JpaRepository<Orders, Long> {
}
