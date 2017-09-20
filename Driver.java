import java.util.Scanner;

public class Driver{
	
	// method listing the menu options
	public static void helpMenu(){
		System.out.println( "----------------------------------------" );
		System.out.println( "\t\tHELP MENU" );
		System.out.println( "----------------------------------------" );
		System.out.println( "\tmenu : view Today's Menu" );
		System.out.println( "\tticket : Show your ticket" );
		System.out.println( "\ttab : Tab out" );
		System.out.println( "\tadd : Add an item to ticket" );
		System.out.println( "\tdelete : Delete the current ticket" );
		System.out.println( "\thelp : List the help menu" );
		System.out.println( "\tquit : Quit the program" );
		System.out.println( "----------------------------------------" );
		
	}
	
	
	public static void main( String[] args ){
		
		
		// creating a list of Menu Items
		// Entrees
		Entree rb = new Entree( "Roast Beef", 15.50, "rb", false );
		Entree bc = new Entree( "Baked Chicken", 18.00, "bc", false );
		Entree pc = new Entree( "Pork Chops", 22.25, "pc", false  );
		Entree ts = new Entree( "Tofu Stir-Fry", 14.50, "ts", true );
		Entree vp = new Entree( "Veggie Pasta", 12.25, "vp", true );
		
		// Drinks
		Drink ap = new Drink( "Arnold Palmer", 2.25, "ap", 'l' , false );
		Drink it = new Drink( "Iced Tea", 2.25, "it", 'l', false );
		Drink sp = new Drink( "Soda Pop", 2.25, "sp", 'l', false );
		Drink fz = new Drink( "Fuzzy Navel", 8.50, "fz", 's', true );
		Drink mn = new Drink( "Manhattan", 12.00, "mn", 's', true );
		
		// Dessert
		Dessert cp = new Dessert( "Cherry Pie", 8.00, "cp", false );
		Dessert cc = new Dessert( "Chocolate Cake", 7.50, "cc", false );
		Dessert bi = new Dessert( "Banana Icecream", 5.25, "bi", true );
		Dessert bp = new Dessert( "Bread Pudding", 7.00, "bp", false );
		Dessert fp = new Dessert( "Fruit Parfait", 9.00, "fp", true );
		
		// Adding the Menu items to todaysMenu
		Menu todaysMenu = new Menu( 20 );
		todaysMenu.insertMenuItem( rb );
		todaysMenu.insertMenuItem( bc );
		todaysMenu.insertMenuItem( pc );
		todaysMenu.insertMenuItem( ts );
		todaysMenu.insertMenuItem( vp );
		todaysMenu.insertMenuItem( ap );
		todaysMenu.insertMenuItem( it );
		todaysMenu.insertMenuItem( sp );
		todaysMenu.insertMenuItem( fz );
		todaysMenu.insertMenuItem( mn );
		todaysMenu.insertMenuItem( cp );
		todaysMenu.insertMenuItem( cc );
		todaysMenu.insertMenuItem( bi );
		todaysMenu.insertMenuItem( bp );
		todaysMenu.insertMenuItem( fp );
		
		// creating an instance of Ticket
		Ticket myTicket = new Ticket( 20 );
		
		// creating an instance of Scanner
		Scanner userInput = new Scanner( System.in );
		String userCommand = "";
		
		// the opening for the program
		System.out.print( "----------------------------------------------\n" );
		System.out.print( "\tWelcome to Jason's Diner.\n");
		System.out.print( "----------------------------------------------\n" );
		
		helpMenu();
		boolean runProgram = true;
		
		// begining of POS program
		while( runProgram ){
			System.out.print( "Please enter a command: " );
			userCommand = userInput.nextLine();
			System.out.println( "You entered: " + userCommand );
			
			// list of methods to call from the options menu
			if( userCommand.equals( "quit" ) ){
				runProgram = false;
			}else if( userCommand.equals( "menu" ) ){
				todaysMenu.menuList();
			}else if( userCommand.equals( "ticket" ) ){
				myTicket.viewTicket();
			}else if( userCommand.equals( "tab" ) ){
				myTicket.tabOut();	
			}else if( userCommand.equals( "add" )){
				todaysMenu.menuList();
				boolean order = true;
				
				// setting a count for for exiting the program; program to end on zero
				int count = myTicket.getLimit();
				while( order ){
					System.out.println( "Please enter an order code ('menu' view menu or 'stop' stops ordering): " );
					String userCode = userInput.nextLine();
					
					// allows user to view menu and stop creating the Ticket myTicket
					if ( userCode.equals( "menu" )){
						todaysMenu.menuList();
					}else if( userCode.equals( "stop" ) ){
						order = false;
						System.out.println( "Your order has stopped, resume ordering by typing 'add' or 'help' for more options." );
					}else{
						
						// finding and returning the order code
						MenuItem item = todaysMenu.getItem( userCode );
						if( item == null ){
							
							// error message if not valid order code
							System.out.println( "Invalid: Please enter a valid order code." );
						}else{
							
							// adding the items from Menu to Ticket
							myTicket.addItem( item );
							count--;
							
							// ending adding to myTicket when counter ends
							
							if( count == 0 ){
									System.out.println( "You can only order " + myTicket.getLimit() + " items." );
									order = false;
							}	
						}
							
					}
				}
			}else if( userCommand.equals( "delete" ) ){
				myTicket.delTicket();
				System.out.println( "Your ticket has been deleted." );
			}else if( userCommand.equals( "help" ) ){
				helpMenu();
			}else
				System.out.println( "Your command is not in the system." );
			}
			System.out.println( "Thank you for using the Jason's Diner POS System." );
		} // end of POS program		
		
	}
	
