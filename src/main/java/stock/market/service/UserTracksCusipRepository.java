package stock.market.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import stock.market.model.Cusip;
import stock.market.model.User;
import stock.market.model.UserTracksCusip;

public interface UserTracksCusipRepository extends JpaRepository <UserTracksCusip, Integer> {
	public UserTracksCusip findById(int id);
	public UserTracksCusip save(UserTracksCusip userTracksCusip);
	public List<UserTracksCusip> findByUser(User user);
	public List<UserTracksCusip> findByCusip(Cusip cusip);
}
