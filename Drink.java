public class Drink extends MenuItem{

	private char size;
	private boolean checkID;
	
	// default constructor
	public Drink(){
		super();
		size = 'x';
		checkID = false;
	}
	
	// constructor for creating a Drink object
	public Drink( String name, double price, String orderCode, char size, boolean checkID ){
		super( name, price, orderCode );
		this.size = size;
		this.checkID = checkID;
	}
	
	// size getter
	public char getSize(){
		return size;
	}
	
	// size setter
	public void setSize( char size ){
		this.size = size;
	}
	
	// checkID getter
	public boolean getID(){
		return checkID;
	}
	
	// checkID setter
	public void setID( boolean checkID ){
		this.checkID = checkID;
	}
	
	// the toString for Drink object
	public String toString(){
		if( checkID == true ){
			return super.toString() + " (21+)  (Size: " + size + ")";
		}else{
			return super.toString() + "  (Size: " + size + ")";
		}
	}

}
