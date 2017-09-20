public class Ticket{
	
	private MenuItem[] theTicket;
	private int nextItem;
	private int limit;
	
	// constructor sets an instance of Ticket and passes in an int for size of array
	public Ticket( int limit ){
		this.limit = limit;
		theTicket = new MenuItem[ this.limit ];		
		nextItem = 0;
	}
	
	// add an item to the array of MenuItems called the ticket
	public void addItem( MenuItem item ){
		if( nextItem < limit ){
			theTicket[ nextItem ] = item;
			nextItem++;
		}
	}
	
	// outputs the list of items MenuItems ordered and produced the sum of the prices
	public void tabOut(){
		System.out.println( "\t-------------------------------------------------" );
		System.out.println( "\tThank you for eating at Jason's Diner!" );
		System.out.println( "\t-------------------------------------------------" );
		double total = 0.00;
		int count = 0;
		for( int i = 0; i < theTicket.length; i++ ){
			if( theTicket[ i ] != null ){
				System.out.println( "\t" + theTicket[ i ] );
				total += theTicket[ i ].getPrice();
				count++;
			}
		}
		System.out.println( "\t-------------------------------------------------" );
		System.out.println( "\tYou ordered " + count + " items." );
		System.out.println( "\tYour Total Today: $" + total );
		System.out.println( "\t-------------------------------------------------\n" );
			
		
	}
	
	// gives you a preview of the MenuItems ordered
	public void viewTicket(){
		System.out.println( "Your current order:" );
		for( int i = 0; i < theTicket.length; i++ ){
			if( theTicket[ i ] != null ){
				System.out.println( "\t" + theTicket[ i ] );
			}
		
		}
	}
	
	// limit getter
	public int getLimit(){
		return this.limit;
	}
	
	// nextItem getter
	public int getNextItem(){
		return nextItem;
	}
	
	// this method takes an array of MenuItems and deletes the content and returns it
	public MenuItem[] delTicket(){
		for( int i = 0; i < theTicket.length; i++){
			if( theTicket[ i ] != null ){
				theTicket[ i ] = null;
			}
		}
		
		return theTicket;
	}
	
	
	
	
}