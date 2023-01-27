package Insurance.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Policy_type")
public class Policy_type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int plolicy_type_id;
	private String policy_name;
	private String description;
	
	public int getPlolicy_type_id() {
		return plolicy_type_id;
	}
	public void setPlolicy_type_id(int plolicy_type_id) {
		this.plolicy_type_id = plolicy_type_id;
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
	public Policy_type(String policy_name, String description) {
		super();
		this.policy_name = policy_name;
		this.description = description;
	}
	
	
	
}
