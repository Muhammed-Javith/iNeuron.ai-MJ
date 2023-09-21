package mjavith.ineuron.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mjavith.ineuron.Entity.Order;
import mjavith.ineuron.Entity.User;

public interface OrderRepo extends JpaRepository<Order, Long> {
       public List<Order> findByUser(User user);
	
}
