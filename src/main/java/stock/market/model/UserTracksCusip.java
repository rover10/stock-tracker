package stock.market.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_tracks_cusip")
public class UserTracksCusip {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}

	@ManyToOne
	@JoinColumn(name = "fk_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "fk_cusip")
	private Cusip cusip;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "trackDate")
	private Date trackDate;
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cusip getCusip() {
		return cusip;
	}

	public void setCusip(Cusip cusip) {
		this.cusip = cusip;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTrackDate() {
		return trackDate;
	}

	public void setTrackDate(Date trackDate) {
		this.trackDate = trackDate;
	}
	
}
