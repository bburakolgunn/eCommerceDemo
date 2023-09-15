package ecommerceDemo.entites.concretes;

public class Register {

	private int id;
	private String FirstName;
	private String LastName;
	private String password;
	private String email;
	
	public Register() {
		
	}

	public Register(int id, String firstName, String lastName, String password, String email) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
