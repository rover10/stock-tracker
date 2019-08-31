package stock.market.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "SUser")
public class User {
	//	public Set<Cusip> getTrackedCusips() {
	//		return trackedCusips;
	//	}
	//	public void setTrackedCusips(Set<Cusip> trackedCusips) {
	//		this.trackedCusips = trackedCusips;
	//	}
	//	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//	public Set<UserTracksCusip> getUserTracksCusip() {
	//		return userTracksCusip;
	//	}
	//	public void setUserTracksCusip(Set<UserTracksCusip> userTracksCusip) {
	//		this.userTracksCusip = userTracksCusip;
	//	}
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(unique = true, nullable = false)
	private String mobile;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "status")
	private String status;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "auth_user_role", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "auth_role_id"))
	private Set<Role> roles;
	
	//	@ManyToMany(cascade=CascadeType.ALL)
	//    @JoinTable(name="track_stocks",    // Will create a table with name 'track_stock'
	//    	joinColumns = { @JoinColumn(referencedColumnName = "id") }, 	
	//    	inverseJoinColumns = { @JoinColumn(referencedColumnName = "id") }) 
	//    private Set<Cusip> trackedCusips;
	//	
	
	//@OneToMany
	//private Set<UserTracksCusip> userTracksCusip = new HashSet<UserTracksCusip>();
		
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
