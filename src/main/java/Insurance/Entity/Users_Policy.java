package Insurance.Entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Users_Policy {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int user_policy_id;
	
	/*we need mapping here
	
	*/
	
	
	 @OneToMany
	
	private List<Users> users=new ArrayList<Users>();
   
	/*we need mapping here
	
	*/
	@ManyToOne
	private Policy policy;
	private Date offred_Date;
	private Date expired_Date;
	private int is_Active;
	public int getUser_policy_id() {
		return user_policy_id;
	}
	public void setUser_policy_id(int user_policy_id) {
		this.user_policy_id = user_policy_id;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public Date getOffred_Date() {
		return offred_Date;
	}
	public void setOffred_Date(Date offred_Date) {
		this.offred_Date = offred_Date;
	}
	public Date getExpired_Date() {
		return expired_Date;
	}
	public void setExpired_Date(Date expired_Date) {
		this.expired_Date = expired_Date;
	}
	public int getIs_Active() {
		return is_Active;
	}
	public void setIs_Active(int is_Active) {
		this.is_Active = is_Active;
	}
	public Users_Policy( List<Users> users, Policy policy, Date offred_Date, Date expired_Date,
			int is_Active) {
		super();
		
		this.users = users;
		this.policy = policy;
		this.offred_Date = offred_Date;
		this.expired_Date = expired_Date;
		this.is_Active = is_Active;
	}
	@Override
	public String toString() {
		return "Users_Policy [user_policy_id=" + user_policy_id + ", users=" + users + ", policy=" + policy
				+ ", offred_Date=" + offred_Date + ", expired_Date=" + expired_Date + ", is_Active=" + is_Active + "]";
	}
	
	
	
	
	
}
