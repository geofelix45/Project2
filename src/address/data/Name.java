package address.data;
/**
 * It represents the Name object
 * which has all of the required attributes.
 * 
 * @version 1.0
 * 
 */
public class Name {

	// Attributes..
	private int id;
	private String firstName;
	private String lastName;
	
	/**
	 * Constructor..
	 * 
	 * @param firstName entry
	 * @param lastName entry
	 */
	public Name(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	
	}
	
	/**
	 * Constructor..
	 * 
	 * @param id entry
	 * @param firstName entry
	 * @param lastName entry
	 */
	public Name(int id, String firstName, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	
	}
	
	/**
	 * Constructor..
	 * 
	 * @param id entry
	 */
	public Name(int id) {
		
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
	 * @return firstName field
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return lastName field
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * To set the new value of firstName
	 *
	 * @param firstName field
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * To set the new value of lastName
	 *
	 * @param lastName field
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		
		return firstName+" "+lastName;
		
	}
	
}
