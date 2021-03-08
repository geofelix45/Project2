package address;
import address.ui.AddressBookUI;

/**
 * It will start the application
 * and use the AddressBook and Menu
 * class object to do all operations.
 * @author Group 8
 * @version 1.0
 * 
 */
public class AddressBookApplication {

	/**
	 * Main method to run the program.
	 * 
	 * @param args console.
	 */
	public static void main(String[] args) {

		AddressBook book = new AddressBook();
		new AddressBookUI(book);
		
		/*try {
			
			int count = book.readFromFile("Addresses.txt");
			JOptionPane.showMessageDialog(null, "Read in "+count+" new Addresses, successfully"
					+ " loaded, currently "+book.list().size()+" Addresses");
			
		} catch (FileNotFoundException e) {
			System.out.println("File Addresses.txt not found.");
		}
		ui.updateAddressEntries(book.list());
		/*String option = "";
		do {
			
			// Printing the menu..
			Menu.printMenu();
			option = Menu.promptMenuOption();
			switch(option) {
			
			// Loading the data from the file.
			case "a":
				String file = Menu.promptFilename();
				try {
					
					int count = book.readFromFile(file);
					System.out.println("Read in "+count+" new Addresses, successfully"
							+ " loaded, currently "+book.list().size()+" Addresses");
					
				} catch (FileNotFoundException e) {
					System.out.println("File "+file+" not found.");
				}
				break;
			
			// Addition of the address entry into the book.
			case "b":
				String firstName = Menu.promptFirstName();
				String lastName = Menu.promptLastName();
				String street = Menu.promptStreet();
				String city = Menu.prompCity();
				String state = Menu.promptState();
				int zip = Menu.promptZip();
				String phone = Menu.promptPhone();
				String email = Menu.promptEmail();
				AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state,
						zip, phone, email);
				book.add(entry);
				System.out.println("Thank you the following contact has been added"
						+ " to your address book: \n  " + entry.toString());
				break;
				
			case "c":
				String remove = Menu.promptRemoveLastName();
				List<AddressEntry> entries = book.find(remove);
				System.out.println("The following "+entries.size()+" entries were found in the address book"
						+ ", sekect number of entry you wish to remove: ");
				for(int i = 0; i < entries.size(); i++) {
					System.out.println((i+1)+":"+entries.get(i));
				}
				int num = Menu.promptIntegerRange(1, entries.size());
				System.out.println("Hit y to remove the following entry or n to return to main menu:\n"
						+ "  "+entries.get(num - 1));
				AddressEntry addressEntry = entries.get(num - 1);
				String yesNo = Menu.promptYesNo();
				if(yesNo.equalsIgnoreCase("y")) {
					book.remove(entries.get(num - 1));
					System.out.println("You have successfully removed the "+addressEntry.getFirstName()+
							" "+addressEntry.getLastName()+" contact");
				}
				break;
			
				// Finding the last name entries..
			case "d":
				String find = Menu.promptFindLastName();
				entries = book.find(find);
				System.out.println("The following "+entries.size()+" entries were found in the address book"
						+ " for a last name starting with \""+find+"\":");
				for(int i = 0; i < entries.size(); i++) {
					System.out.println((i+1)+":"+entries.get(i));
				}
				break;
				
				// Listing the entries..
			case "e":
				entries = book.list();
				for(int i = 0; i < entries.size(); i++) {
					System.out.println((i+1)+":"+entries.get(i));
				}
				break;
				
				// Closing the application..
			case "f":
				try {
					book.save();
				} catch (IOException e) {
					System.out.println("Exception occured while writing file.");
				}
				System.out.println("Goodbye!");
				break;
			
			}
			System.out.println();
			
		} while(!option.equals("f"));*/
		
	}

}
