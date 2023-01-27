package Insurance.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Policy")
public class Policy {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policy_id;
	private String policy_name;
	private String description;
   
	/*we need mapping here
	
	*/
	
	@ManyToOne
	private Policy_type policy_type;

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Policy_type getPolicy_type() {
		return policy_type;
	}

	public void setPolicy_type(Policy_type policy_type) {
		this.policy_type = policy_type;
	}

	@Override
	public String toString() {
		return "Policy [policy_id=" + policy_id + ", policy_name=" + policy_name + ", description=" + description
				+ ", policy_type=" + policy_type + "]";
	}

	public Policy() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Policy( String policy_name, String description, Policy_type policy_type) {
		super();
		
		this.policy_name = policy_name;
		this.description = description;
		this.policy_type = policy_type;
	}
	
	
	
}
