public class Toy {

	private String name;
	private String type;
	private double price;
	private int manYear;
	private int ageRestriction;
	int quantity;

	public Toy(String name, String type, double price) {
		setName(name);
		setType(type);
		setPrice(price);
		setManYear(2014);
		setAgeRestriction(1);
		setQuantity(1);
	}

	public Toy(String name, String type, double price, int manYearOrAgeRestr, int quantity) {
		setName(name);
		setType(type);
		setPrice(price);

		if (manYear < 100) {
			setAgeRestriction(manYearOrAgeRestr);
		} else {
			setManYear(manYearOrAgeRestr);
		}
	}

	public Toy(String name, String type, double price, int manYear,
			int ageRestriction, int qunatity) {
		setName(name);
		setType(type);
		setPrice(price);
		setManYear(manYear);
		setAgeRestriction(ageRestriction);
		setQuantity(quantity);
	}

	public Toy(Toy other) {
		this.name = other.name;
		this.type = other.type;
		this.price = other.price;
		this.manYear = other.manYear;
		this.ageRestriction = other.ageRestriction;
		this.quantity=other.quantity;
	}

	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity (int quantity){
		if( quantity<1){
			throw new IllegalArgumentException("Kolicina ne moze biti nula!");
		}else{
			this.quantity=quantity;
		}
	}
	public void increaseQuantity ( int additional){
		this.quantity += additional;
	}
	
	public int getManYear() {
		return manYear;
	}

	public void setManYear(int manYear) {
		this.manYear = manYear;
	}

	public int getAgeRestriction() {
		return ageRestriction;
	}

	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	public String getName() {
		return name;
	}

	
	
	public void setName(String name) {
		if (name.length() < 1) {
			throw new IllegalArgumentException("Ime prazno!");
		} else {
			this.name = name;
		}
	}
	
	public String getType(){
		return type;
	}

	public void setType(String type) {
		if (type.length() < 1) {
			throw new IllegalArgumentException("Tip prazno!");
		} else {
			this.type = type;
		}
	}
	
	public double getPrice(){
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Cijena manja od nule!");
		} else {
			this.price = price;
		}
	}
	
	public boolean equals(Toy other){
		if (this.name.equals(other.name) && this.type.equals(other.type)
			&& this.price==other.price &&this.ageRestriction==other.ageRestriction && this.manYear==other.manYear){
				return true;
			}else{
				return false;
			}
	}
	
	public String toString(){
		String out="";
		out+="Name: "+this.name;
		out+="\n\tPrice: "+this.price;
		out+="\n\tType: "+this.type;
		out+="\n\tAge: "+this.ageRestriction;
		out+="\n\tYear: "+this.manYear;
		out+="\n\tQuantity: "+this.quantity;
		return out;		
	}
	
	

}
