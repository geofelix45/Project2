package address;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import address.data.Address;
import address.data.AddressEntry;
import address.data.Name;

/**
 * It includes a list of 
 * address entries.
 * 
 * @version 1.0
 * 
 */
public class AddressBook {

	// Attributes..
	private List<AddressEntry> addressEntryList;
	private DBConnection db;
	
	/**
	 * Constructor to create the 
	 * list of the address entries.
	 */
	public AddressBook() {
		
		this.addressEntryList = new ArrayList<>();
		try {
			db = new DBConnection();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "There is an error in connecting with database.");
		}
		readDBData();
		
	}
	
	/**
	 * Reading the DB data..
	 */
	private void readDBData() {
		
		try {
			
			ResultSet rs = db.executeQuery("SELECT * FROM ADDRESSENTRY");
			while(rs.next()) {
				
				this.addressEntryList.add(new AddressEntry(
						rs.getInt(1), new Name(rs.getInt(2)), 
						new Address(rs.getInt(3)), 
						rs.getString(4), rs.getString(5)));
				
			}
			// Reading data of names..
			rs = db.executeQuery("SELECT * FROM NAME");
			while(rs.next()) {
				
				int id = rs.getInt(1);
				for(AddressEntry entry: this.addressEntryList) {
					if(entry.getName().getId() == id) {
						entry.getName().setFirstName(rs.getString(2));
						entry.getName().setLastName(rs.getString(3));
						break;
					}
				}
				
			}
			// Reading data of names..
			rs = db.executeQuery("SELECT * FROM ADDRESS");
			while (rs.next()) {

				int id = rs.getInt(1);
				for (AddressEntry entry : this.addressEntryList) {
					if (entry.getAddress().getId() == id) {
						entry.getAddress().setStreet(rs.getString(2));
						entry.getAddress().setCity(rs.getString(3));
						entry.getAddress().setState(rs.getString(4));
						entry.getAddress().setZip(rs.getInt(5));
						break;
					}
				}

			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "There is an error in connecting with database.");
		}
		
	}
	
	/**
	 * @return the list of address entries.
	 */
	public List<AddressEntry> list() {
		
		return this.addressEntryList;
		
	}
	
	/**
	 * It will add a new entry into the list.
	 * 
	 * @param entry to add in list
 	 */
	public void add(AddressEntry entry) {
		
		this.addressEntryList.add(entry);
		try {

			db.execute("INSERT INTO NAME(FIRSTNAME,LASTNAME) VALUES('"
					+entry.getName().getFirstName()+"','"+entry.getName().getLastName()+"');");
			int nameId = db.getLastID("NAME");
			Address ad = entry.getAddress();
			db.execute("INSERT INTO ADDRESS(STREET,CITY,STATE,ZIP) VALUES('"
					+ad.getStreet()+"','"+ad.getCity()+"','"+ad.getState()+"',"+ad.getZip()+");");
			int addressId = db.getLastID("ADDRESS");
			db.execute("INSERT INTO ADDRESSENTRY(NAMEID, ADDRESSID, PHONE, EMAIL) VALUES("
					+ nameId+","+addressId+",'"+entry.getPhone()+"','"+entry.getEmail()+"');");
					
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "There is an error in connecting with database.");
		}	
		
	}

	/**
	 * It will remove entry from the list.
	 * 
	 * @param entry to remove from list
 	 */
	public void remove(AddressEntry entry) {
		
		this.addressEntryList.remove(entry);
		try {

			db.execute("DELETE FROM ADDRESS WHERE ADDRESSID="+entry.getAddress().getId());
			db.execute("DELETE FROM NAME WHERE NAMEID="+entry.getName().getId());
			db.execute("DELETE FROM ADDRESSENTRY WHERE ADDRESSENTRYID="+entry.getId());
	
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "There is an error in connecting with database.");
		}
		
	}
	
	/**
	 * It will search for the entries with the
	 * last name given and find them.
	 * 
	 * @param lastName the last name to find
	 * @return the list of address entries.
	 */
	public List<AddressEntry> find(String lastName) {
		
		List<AddressEntry> find = new ArrayList<>();
		for(AddressEntry entry: this.addressEntryList) {
			if(entry.getName().getLastName().toLowerCase().contains(lastName.toLowerCase())) {
				find.add(entry);
			}
		}
		return find;
		
	}
	
	/**
	 * It will read all of the data from the
	 * file and put it into the address entries.
	 * 
	 * @param filename to read
	 * @return number of elements read from file.
	 * @throws FileNotFoundException if file not found.
	 */
	/*public int readFromFile(String filename) throws FileNotFoundException {
		
		int count = 0;
		Scanner scan = new Scanner(new File(filename));
		while(scan.hasNextLine()) {
			String[] tokens = scan.nextLine().split(",");
			if(tokens.length == 8) {
				
				int zip = 0;
				try {
					zip = Integer.parseInt(tokens[5]);
				} catch(Exception e) {
					continue;
				}
				count++;
				add(new AddressEntry(tokens[0], tokens[1], tokens[2], 
						tokens[3], tokens[4], zip, tokens[6], tokens[7]));
				
			}
		}
		scan.close();
		return count;
		
	}*/
	
	/**
	 * It will save all of the data into the file.
	 * @throws IOException exception while writing data.
	 */
	/*public void save() throws IOException {
		
		// Deleting the file if exists.
		File file = new File("Addresses.txt");
		if(file.exists()) {
			file.delete();
		}
		PrintWriter writer = new PrintWriter(new FileWriter(file));
		for(AddressEntry entry: this.addressEntryList) {
			
			writer.println(entry.getFirstName()+","+entry.getLastName()
				+","+entry.getStreet()+","+entry.getCity()+","+entry.getState()
				+","+entry.getZip()+","+entry.getPhone()+","+entry.getEmail());
			
		}
		writer.close();
		
	}*/
	
}
