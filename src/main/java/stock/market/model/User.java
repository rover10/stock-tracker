package stock.market.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "SUser")
public class User {
	public Set<Cusip> getTrackedCusips() {
		return trackedCusips;
	}
	public void setTrackedCusips(Set<Cusip> trackedCusips) {
		this.trackedCusips = trackedCusips;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(unique = true, nullable = false)
	private String mobile;
	
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="track_stocks",    // Will create a table with name 'track_stock'
    	joinColumns = { @JoinColumn(referencedColumnName = "id") }, 
    			
    	inverseJoinColumns = { @JoinColumn(referencedColumnName = "id") }) 
    private Set<Cusip> trackedCusips;
	
	private String country;
	private String firstName;
	private String lastName;
	private String middleName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
}
