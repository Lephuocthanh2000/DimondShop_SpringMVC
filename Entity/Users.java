package DiamonShop.Entity;

public class Users {
	private String id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String PassWord;
	private String Address;
	private String Birthday;
	public Users() {
		super();
	}
	public Users(String id, String firstName, String lastName, String email, String passWord, String address,
			String birthday) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		PassWord = passWord;
		Address = address;
		Birthday = birthday;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	
	
	

	
}
