package address.data;
/**
 * It represents the Address Entry object
 * which has all of the required attributes.
 * 
 * @version 1.0
 * 
 */
public class AddressEntry {

	// Attributes..
	private int id;
	private Name name;
	private Address address;
	private String phone;
	private String email;
	
	/**
	 * Constructor to create Address
	 * object.
	 * 
	 * @param firstName field
	 * @param lastName field
	 * @param street field
	 * @param city field
	 * @param state field
	 * @param zip field
	 * @param phone field
	 * @param email field
	 */
	public AddressEntry(String firstName, String lastName, String street, String city, 
			String state, int zip, String phone, String email) {
		
		this(new Name(firstName, lastName), new Address(street, city, state, zip), phone, email);
	
	}

	/**
	 * Constructor to create address object.
	 * 
	 * @param name field
	 * @param address field
	 * @param phone field
	 * @param email field
	 */
	public AddressEntry(Name name, Address address, String phone, String email) {
	
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}	
	
	/**
	 * Constructor to create address object.
	 * 
	 * @param id field
	 * @param name field
	 * @param address field
	 * @param phone field
	 * @param email field
	 */
	public AddressEntry(int id, Name name, Address address, String phone, String email) {
	
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}	
	
	/**
	 * Empty Constructor.
	 */
	public AddressEntry() {
		
		this("", "", "", "", "", 0, "", "");
		
	}
	
	/**
	 * @return id field
	 */
	public int getId() {
		return id;
	}

	/**
	 * To set the new value of id
	 *
	 * @param id field
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name field
	 */
	public Name getName() {
		return name;
	}

	/**
	 * @return address field
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * @return phone field
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return email field
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * To set the new value of name
	 *
	 * @param name field
	 */
	public void setName(Name name) {
		this.name = name;
	}

	/**
	 * To set the new value of address
	 *
	 * @param address field
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * To set the new value of phone
	 *
	 * @param phone field
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * To set the new value of email
	 *
	 * @param email field
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		return name+" - "+address +" - "+email+" - "+phone;
		
	}
	
}
