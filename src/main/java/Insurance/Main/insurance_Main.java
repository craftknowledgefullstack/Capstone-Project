package Insurance.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Insurance.Entity.Policy;
import Insurance.Entity.Policy_type;
import Insurance.Entity.Role_Type;
import Insurance.Entity.Users;
import Insurance.Entity.Users_Policy;

public class insurance_Main {

	
	static Persistence persistence= new Persistence();
	static EntityManagerFactory entityManagerFactory= persistence.createEntityManagerFactory("mysql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	
	static public void UserRegistration( Role_Type role_Type  , Users users) {
		
		
		entityManager.getTransaction().begin();
		
		
		entityManager.persist(role_Type);
		entityManager.persist(users);
		
		entityManager.getTransaction().commit();
		
	}
	
	static public void addPolicyType(Policy_type policyType) {
		
		
		entityManager.getTransaction().begin();
		
		
		entityManager.persist(policyType);
		
		
		entityManager.getTransaction().commit();
		
		
	}
	
	static void resisterPolicy(Policy policy) {
		
		entityManager.getTransaction().begin();
		
		
		entityManager.persist(policy);
		
		
		entityManager.getTransaction().commit();
		
	}
	static void adduserPolicy(Users_Policy users_Policy) {
		
		
		
		entityManager.getTransaction().begin();
		
		
		entityManager.persist(users_Policy);
		
		
		entityManager.getTransaction().commit();	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		Role_Type  role= new Role_Type("admin");
		Role_Type  role2= new Role_Type("User");
		Users users= new Users("robel", "shanbel", role,"addis ababa" , "09232323", "robel@gmail.com", "123");
		Users users2= new Users("dagem", "man", role2,"addis ababa" , "09232323", "dagem@gmail.com", "11223");
		
		
		
		//Register users 
		
		
		UserRegistration(role, users);
		UserRegistration(role2, users2);
		
		// Add Policy Type
		
		Policy_type policyType= new  Policy_type("Life Insurance", "Life insurance protects the people that are financially dependent on you");
		Policy_type policyType2= new  Policy_type("Health Insurance", "The soaring cost of medical care is reason enough to make health insurance a necessity.");
		
		addPolicyType(policyType);
		addPolicyType(policyType2);
		
		// Register Policy
		
		Policy policy= new Policy("LI3232", "THIS IS POLICY DES", policyType);
		Policy policy2= new Policy("HI0023", "THIS IS POLICY DES", policyType2);

		resisterPolicy(policy);
		resisterPolicy(policy2);
		
		// add Users Policy
		
		List<Users>list= new  ArrayList<Users>();
		
		list.add(users);
		list.add(users2);
		Date d = new Date();  
		Users_Policy users_Policy= new Users_Policy(list, policy2, d, d, 0);
		
		adduserPolicy(users_Policy);
		
	}

}
