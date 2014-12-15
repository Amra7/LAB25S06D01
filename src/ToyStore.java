public class ToyStore {

	private String name;
	private Toy[] inventory;
	private int numToys;

	public ToyStore(String name) {
		setName(name);
		inventory = new Toy[1];

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 1) {
			throw new IllegalArgumentException("Prazno ime!");
		} else {
			this.name = name;
		}
	}

	public int getNumToys() {
		return numToys;
	}

	public String toString() {
		String str = "";
		str += "Name: " + name;
		str += "\n\tInventory: ";
		for (int i = 0; i < numToys; i++) {
			str += inventory[i].toString();
		}
		str += "\nNumber of toys: " + numToys;

		return str;
	}

	public void addToy(Toy newToy) {
		/* check if in inventory */
		for (int i = 0; i < numToys; i++) {
			if (inventory[i].equals(newToy)) {
				inventory[i].increaseQuantity(newToy.getQuantity());
			}
		}

		inventory[numToys] = new Toy(newToy);
		numToys++;
		if (numToys == inventory.length) {
			resize();
		}
	}

	private void resize() {
		int newSize = this.inventory.length * 2;
		Toy[] temp = new Toy[newSize];

		for (int i = 0; i < numToys; i++) {
			temp[i] = this.inventory[i];
		}

		this.inventory = temp;

	}

	public void removeToy(Toy newToy) {
		for (int i = 0; i < numToys; i++) {
			if (inventory[i].equals(newToy)) {
				for (int j = i + 1; j < numToys; j++) {
					inventory[i] = inventory[j];
				}
				inventory[numToys] = null;
				numToys--;
			}
		}
	}
	
	public String  printByQuntity(){
		sortInentoryByQuantity();
		return toString();
	}

	// public boolean equlas (Toy other){
	// if (this.name.equals(other.getName()) &&
	// this.type.equals(other.getType())
	// && this.Toy.getPrice==other.getPrice()
	// &&this.getAgeRestriction==other.getAgeRestriction &&
	// this.getManYear==other.getManYear){
	// return true;
	// }else{
	// return false;
	// }
	// }

}
