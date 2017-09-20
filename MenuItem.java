public abstract class MenuItem{
	
	private String name;
	private double price;
	private String orderCode;
	
	// constructor for the parent class MenuItem
	public MenuItem(){
		name = "default name";
		price = 0.00;
		orderCode = "default code";
	}
	
	// constructor to pass on to child classes
	public MenuItem( String name, double price, String orderCode ){
		this.name = name;
		this.price = price;
		this.orderCode = orderCode;
	}
	
	// name getter
	public String getName(){
		return name;
	}
	
	// name setter
	public void setName( String name ){
		this.name = name;
	}
	
	// price getter
	public double getPrice(){
		return price;
	}
	
	// price setter
	public void setPrice( double price ){
		this.price = price;
	}
	
	// orderCode getter
	public String getCode(){
		return orderCode;
	}
	
	// orderCode setter
	public void setCode( String orderCode ){
		this.orderCode = orderCode;
	}
	
	// toString to pass to child classes
	public String toString(){
		
		return orderCode + " : " + name + "  Price: $" + price;
	}
	
}