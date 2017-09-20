public class Menu{
	
	private MenuItem[] theMenu;
	private int nextItem;
	private int limit;
	
	
	// constructor sets a instance of Menu and take an int varable for the array size
	public Menu( int limit ){
		this.limit = limit;
		theMenu = new MenuItem[ this.limit ];
		nextItem = 0;
	}
	
	// inserts MenuItems into theMenu array
	public void insertMenuItem( MenuItem item ){
		theMenu[ nextItem ] = item;
		nextItem++;
	}
	
	// inserts MenuItems at a positon in array
	public void insertMenuItem( MenuItem item, int index ){
		theMenu[ index ] = item;
	}
	
	// prints out a list of the Menu Items
	public void menuList(){
		System.out.println( "------------------------------------------------------" );
		System.out.println( "\t\tToday's Menu:" );
		System.out.println( "------------------------------------------------------" );
		for( int i = 0; i < theMenu.length; i++ )
			if( theMenu[ i ] != null ){
				System.out.println( "\t" + theMenu[ i ].toString() );
			}
		System.out.println( "\n| (g) gluten-free | (v) vegan | (21+) alcoholic |" );
		System.out.println( "------------------------------------------------------" );
	}
	
	// returns a menu item, if it matches a menu item
	public MenuItem getItem( String orderCode ){ 
		
		MenuItem item = null;
		for( int i = 0; i < theMenu.length; i++ ){
			if( theMenu[ i ] != null ){
				if( orderCode.equals( theMenu[ i ].getCode() ) ){
					item = theMenu[ i ];
					break;
				}
			}
		}
		return item;
	}
	
	// returns the size of array
	public int getLimit(){
		return limit;
	}
  
	
}