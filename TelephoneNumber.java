 import java.io.*;
/**
 * The method TelephoneNumber class
 * @author Keromamang
 *
 */
public class TelephoneNumber {
   
       static final String DEFAULT_FILENAME = "C:\\Users\\Keromamang\\Dropbox\\Thatohatsi -51240\\Introduction to Software Engineering\\Task 24\\TelephoneNumber";
       		

	private static final String TextIO = null;

	private static final boolean changed = false;
   
       static TelephoneNumber directory;  // Holds the data for


                                         //    the phone directory.
   
       /**
        * The main method
        * @param args
        */
       public static void main(String[] args) {
       
          String fileName;  // Name of file that stores the directory data.
          boolean done;  // Set to true when the user wants to exit the program.
          
          /* Get the file name from the command line, or use the
             DEFAULT_FILENAME if there is no command-line argument. */
          
          if (args.length == 0)
             fileName = DEFAULT_FILENAME;
          else
             fileName = args[0];
          
          /* Read the phone directory data from the file.  This routine
             might terminate the program if an error occurs when the
             attempt is made to end the data. */
          
          readTelePhoneNumberData(fileName);
          
          /* Show user a menu of available operations, get the user's
             choice, and carry it out.  Repeat until the user selects
             the "Exit from this program" operation.  Each of the other
             four commands is carried out by calling a subroutine. */
          
          done = false;
          
          while (done == false) {
        	  System.out.println();
        	  System.out.println();
        	  System.out.println("Select the operation you want to perform:");
        	  System.out.println();
        	  System.out.println("     1.  Look up a phone number");
        	  System.out.println("     2.  Add an entry to the directory");
        	  System.out.println("     3.  Delete an entry from the directory");
        	  System.out.println("     4.  Change someone's phone number");
        	  System.out.println("     5.  Exit form this program.");
        	  System.out.println();
        	  System.out.println("Enter the number of your choice: ");
              int menuOption = 0;
              switch (menuOption) {
                 case 1:
                    doLookup();
                    break;
                 case 2:
                    doAddEntry();
                    break;
                 case 3:
                    doDeleteEntry();
                    break;
                 case 4:
                    doModifyEntry();
                    break;
                 case 5:
                    done = true;
                    break;
                 default:
                    System.out.println("Illegal choice! Please try again.");
              }  // end switch
          } // end while
          
          /* If the phone directory data has been modified, write the
             changed data back to the file. */
          
          if (directory.changed == true)
             writePhoneData(fileName);
             
          System.out.println("\nExiting program.");
       
       } // end main()
   
       /**
        * this is for what will be written on the output
        * @param fileName2
        */
       private static void readTelePhoneNumberData(String fileName2) {
											// TODO Auto-generated method stub
											
										}

    /**
     * method created for the doModifyEntry() 
     */
	private static void doModifyEntry() {
											// TODO Auto-generated method stub
											
										}


	/**
	 * created for the main fileName
	 * @param fileName
	 */
	static void readPhoneData(String fileName) {
             // Get the data for the phone directory from the specified
             // file.  Terminate the program if an error occurs.  If the
             // file does not exist, give the user the option of creating
             // it.
          FileReader in = null;  // A stream for reading the data.
          try {
                // Try to create a stream for reading from the file.
                // If the file is not found, set the value of in to null.
              FileReader in1 = new FileReader(fileName);
          }
          catch (Exception e) {
             in = null;
          }
          // The specified file could not be opened.  Give the
		  // user the option of creating a new, empty file.
     	  System.out.println("\nThe file \"" + fileName + "\" does not exist.");
     	  System.out.println("Do you want to create the file? ");
          boolean create =  getlnBoolean();
          if (create == false) {
		 System.out.println("Program aborted.");
		System.exit(0);
          }
          directory = new TelephoneNumber();  // A new, empty phone directory.
          try {
		   // Try to create the file.
		PrintWriter out = new PrintWriter( new FileWriter(fileName) );
		directory.save(out);
		if (out.checkError())
		   throw new Exception();
		System.out.println("Empty directory created.");
          }
          catch (Exception e) {
		 System.out.println("Can't create file.");
		 System.out.println("Program aborted.");
		System.exit(0);
          }
       }  // end readPhoneData()

    /**
     * method to read in through the input file using FileReader
     */
	private FileReader in;
	 
	{
        // The input stream was created successfully.  Get the data.
     try {
         directory = new TelephoneNumber();  // A new, empty directory.
         directory.load(in);  // Try to load it with data from the file.
     }
     catch (Exception e) {
        System.out.println("An error occurred while read data from \"" + DEFAULT_FILENAME + "\":");
        System.out.println(e.toString());
        System.out.println("Program aborted.");
        System.exit(0);
     }
  }  // end readPhoneData()

       
       private void load(FileReader in) {
		// TODO Auto-generated method stub
		
	}


	private static boolean getlnBoolean() {
		// TODO Auto-generated method stub
		return false;
	}


	static void writePhoneData(String fileName) {
            // Save the data from the phone directory to the specified file.
          PrintWriter out;
          try {
             out = new PrintWriter( new FileWriter("C:\\Users\\Keromamang\\Dropbox\\Thatohatsi -51240\\Introduction to Software Engineering\\Task 24\\output.txt") );
          }
          catch (Exception e) {
             System.out.println("\nCan't open file for output!");
             System.out.println("Changes have not been saved.");
             return;
          }
          directory.save(out);
          if (out.checkError()) {
             System.out.println("Some error occurred while saving data to a file.");
             System.out.println("Sorry, but your phone directory might be ruined");
          }
       }
       
       
       public void save(PrintWriter out) {
		// TODO Auto-generated method stub
		
	}


	static void doLookup() {
              // Carry out the "Look up a phone number" command.  Get
              // a name from the user, then find and print the associated
              // number if any.
          System.out.println("\nLook up the name: ");
          String name = " ";
          String number = directory.numberFor(name);
          if (number == null)
             System.out.println("\nNo such name in the directory.");
          else
             System.out.println("\nThe number for " + name + " is " + number);
       }
       
       
       public String numberFor(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	static void doAddEntry() {
              // Carry out the "Add an entry to the directory" command.
              // This will only work if the name that the user specifies
              // does not already exist in the directory.  If it does,
              // print an error message and exit.  Otherwise, get the
              // number for that person from the user and add the entry
              // to the directory.
          System.out.println("\nAdd entry for this name: ");
          String name = " ";
          if (directory.numberFor(name) != null) {
             System.out.println("That name is already in the directory.");
             System.out.println("Use command number 4 to change the entry for " + name);
             return;
          }
          System.out.println("What is the number for " + name + "? ");
          String number = " ";
          directory.addNewEntry(name,number);
       }
       
       
       public void addNewEntry(String name, String number) {
		// TODO Auto-generated method stub
		
	}

   
	static void doDeleteEntry() {
              // Carry out the "Delete an entry from the directory" command.
              // Get the name to be deleted from the user and delete it.
              // If the name doesn't exist in the directory, print a message.
          System.out.println("\nDelete the entry for this name: ");
          String name = " ";
          if (directory.numberFor(name) == null)
        	  System.out.println("There is not entry for " + name);
          else {
             directory.deleteEntry(name);
             System.out.println("Entry deleted.");
          }
       }
       
       /*
        * creates method for the deleteEntry taking in the String
        */
       public void deleteEntry(String name) {
		// TODO Auto-generated method stub
		
	}


	static void doModifyEntry1() {
              // Carry out the "Change someone's phone number" command.
              // Get the name from the user.  If the name does not exist
              // in the directory, print a message and exit.  Otherwise,
              // get the new number for that person and make the change.
		 System.out.println("\nChange the number for this name: ");
          String name = " ";
          if (directory.numberFor(name) == null) {
        	  System.out.println("That name is not in the directory.");
        	  System.out.println("Use command number 2 to add an entry for " + name);
             return;
          }
          System.out.println("What is the new number for " + name + "? ");
          String number = " ";
          directory.updateEntry(name,number);
       }

     /**
      * add up to two Strings
      * @param name
      * @param number
      * @returns strings combined
      */
	public void updateEntry(String name, String number) {
		// TODO Auto-generated method stub
		
	}
   
   
   } // end class Phones


      
      
