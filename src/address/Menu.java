package address;
import java.util.Scanner;

/**
 * It read the data from console
 * or write the data to the console.
 * 
 * @version 1.0
 * 
 */
public class Menu {

	// Attributes..
	private static Scanner scan = new Scanner(System.in);
	
	// Methods..
	
	/**
	 * It will print the menu to the console.
	 */
	public static void printMenu() {
		
		System.out.println("***************************\n"
				+ "Please enter in your menu selection\n"
				+ "a) Loading From File\n"
				+ "b) Addition\n"
				+ "c) Removal\n"
				+ "d) Find\n"
				+ "e) Listing\n"
				+ "\n"
				+ "f) Quit\n" +
				"***************************");
		
	}
	
	/**
	 * It will prompt the menu option,
	 * and ask for the input.
	 * 
	 * @return input
	 */
	public static String promptMenuOption() {
		
		String option = "";
		do {
			
			System.out.print(">");
			option = scan.nextLine();
			if(option.equals("a") || option.equals("b") || option.equals("c") || 
					option.equals("d") || option.equals("e") || option.equals("f")) {
				break;
			} else {
				System.out.println("Please enter correct option, Try again!");
			}
			
		} while(true);
		return option;
		
	}
	
	/**
	 * It will prompt the user for yes or no.
	 * 
	 * @return input
	 */
	public static String promptYesNo() {
		
		String option = "";
		do {
			
			System.out.print(">");
			option = scan.nextLine();
			if(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("Please enter correct option, Try again!");
			}
			
		} while(true);
		return option;
		
	}
	
	/**
	 * It will prompt the user for given data
	 * in the specified range.
	 * 
	 * @param start of range
	 * @param end of range
	 * @return input
	 */
	public static int promptIntegerRange(int start, int end) {
		
		int number = 0;
		do {
			
			System.out.print(">");
			try {
				
				number = Integer.parseInt(scan.nextLine());
				if(number >= start && number <= end) {
					break;
				} else {
					System.out.println("Please enter correct integer range, Try again!");
				}
				
			} catch(Exception e) {
				System.out.println("Please enter the correct integer range.");
			}
			
		} while(true);
		return number;
		
	}

	/**
	 * It will prompt on the console for the
	 * file name.
	 * 
	 * @return input data.
	 */
	public static String promptFilename() {
		
		System.out.print("Enter in FileName:\n>");
		return scan.nextLine();
		
	}

	/**
	 * It will prompt on the console to
	 * take last name to find it.
	 * 
	 * @return input data.
	 */
	public static String promptFindLastName() {
		
		System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find: ");
		System.out.print(">");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console to 
	 * take last name to remove it.
	 * 
	 * @return input data.
	 */
	public static String promptRemoveLastName() {
		
		System.out.println("Enter in Last Name of contact to remove: ");
		System.out.print(">");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console for the
	 * first name.
	 * 
	 * @return input data.
	 */
	public static String promptFirstName() {
		
		System.out.print("First Name:\n>");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console for the
	 * last name.
	 * 
	 * @return input data.
	 */
	public static String promptLastName() {
		
		System.out.print("Last Name:\n>");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console for the
	 * street.
	 * 
	 * @return input data.
	 */
	public static String promptStreet() {
		
		System.out.print("Street:\n>");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console for the
	 * city.
	 * 
	 * @return input data.
	 */
	public static String prompCity() {
		
		System.out.print("City:\n>");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console for the
	 * state.
	 * 
	 * @return input data.
	 */
	public static String promptState() {
		
		System.out.print("State:\n>");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console for the
	 * email.
	 * 
	 * @return input data.
	 */
	public static String promptEmail() {
		
		System.out.print("Email:\n>");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console for the
	 * phone.
	 * 
	 * @return input data.
	 */
	public static String promptPhone() {
		
		System.out.print("Phone xxx-aaa-bbbb:\n>");
		return scan.nextLine();
		
	}
	
	/**
	 * It will prompt on the console for the
	 * zip.
	 * 
	 * @return input data.
	 */
	public static int promptZip() {
		
		int zip;
		do {
			
			System.out.print("Zip:\n>");
			try {
				
				String value = scan.nextLine();
				zip = Integer.parseInt(value);
				break;
				
			} catch(Exception e) {
				System.out.println("Please enter the correct zip.");
			}
			
		} while(true);
		return zip;
		
	}
	
}
