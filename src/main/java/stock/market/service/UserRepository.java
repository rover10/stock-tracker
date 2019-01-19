package stock.market.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.market.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public List<User> findAll();
	public User save(User user);
	public User findById(int id);
}