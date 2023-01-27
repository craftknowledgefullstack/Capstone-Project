package Insurance.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role_Type")
public class Role_Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;
	private String role_Name;
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_Name() {
		return role_Name;
	}
	public void setRole_Name(String role_Name) {
		this.role_Name = role_Name;
	}
	public Role_Type( String role_Name) {
		super();
		
		this.role_Name = role_Name;
	}
	public Role_Type() {
		super();
		//TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Role_Type [role_id=" + role_id + ", role_Name=" + role_Name + "]";
	}
	
	
	
}
