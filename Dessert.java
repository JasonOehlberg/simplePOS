public class Dessert extends MenuItem{
	
	private boolean glutenFree;
	
	//default constructor
	public Dessert(){
		super();
		glutenFree = false;
	}
	
	// constructer creating a dessert item
	public Dessert( String name, double price, String orderCode, boolean glutenFree ){
		super( name, price, orderCode);
		this.glutenFree = glutenFree;
	}
	
	// setter for glutenFree
	public void setGluten( boolean glutenFree ){
		this.glutenFree = glutenFree;
	}
	
	// getter for glutenFree
	public boolean getGluten(){
		return glutenFree;
	}
	
	// printing the dessert object
	public String toString(){
		if( glutenFree == true ){
			return super.toString() + "   (g)";
		}else{
			return super.toString();
		}
	}
}