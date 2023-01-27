package Insurance.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_Id;
	private String fname;
	private String lname;
 
	/*we need mapping here
	
	*/
	
	@ManyToOne

	private Role_Type role_Type;
	
	
	private String address;
	private String phone;
	private String email;
	private String password;
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Role_Type getRole_id() {
		return role_Type;
	}
	public void setRole_id(Role_Type role_id) {
		this.role_Type = role_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Users( String fname, String lname, Role_Type role_Type, String address, String phone, String email,
			String password) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.role_Type = role_Type;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [user_Id=" + user_Id + ", fname=" + fname + ", lname=" + lname + ", role_id=" + role_Type
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
