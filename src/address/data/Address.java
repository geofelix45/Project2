package address.data;
/**
 * It represents the Address object
 * which has all of the required attributes.
 * 
 * @version 1.0
 * 
 */
public class Address {

	// Attributes..
	private int id;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	/**
	 * Constructor.
	 * 
	 * @param street entry
	 * @param city entry
	 * @param state entry
	 * @param zip entry
	 */
	public Address(String street, String city, String state, int zip) {
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	}
	
	/**
	 * Constructor.
	 * 
	 * @param id entry
	 * @param street entry
	 * @param city entry
	 * @param state entry
	 * @param zip entry
	 */
	public Address(int id, String street, String city, String state, int zip) {
		
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	}
	
	/**
	 * Constructor.
	 * 
	 * @param id entry
	 */
	public Address(int id) {
		
		this.id = id;
		
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
	 * @return street field
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return city field
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return state field
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return zip field
	 */
	public int getZip() {
		return zip;
	}
	
	/**
	 * To set the new value of street
	 *
	 * @param street field
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * To set the new value of city
	 *
	 * @param city field
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * To set the new value of state
	 *
	 * @param state field
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * To set the new value of zip
	 *
	 * @param zip field
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		
		return street+" "+
			city+", "+state+" "+zip;
		
	}

}
