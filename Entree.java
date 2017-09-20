public class Entree extends MenuItem{

	private boolean vegan;
	
	// default constructor
	public Entree(){
		super();
		vegan = false;
	}
	
	// constuctor for making a Entree object
	public Entree( String name, double price, String orderCode, boolean vegan ){
		super( name, price, orderCode );
		this.vegan = vegan;
	}
	
	// getVegan getter
	public boolean getVegan(){
		return vegan;
	}
	
	// getVegan setter
	public void setVegan( boolean vegan ){
		this.vegan = vegan;
	}
	
	// toSting for Entree object
	public String toString(){
		if( vegan == true ){
			return super.toString() + "   (v)";
		}else
			return super.toString();		
	}
}