
public class TestToy {

	public static void main(String[] args) {
		
		 Toy prva = new Toy("Name", "tip", 12.12, 1, 1);
		 Toy druga = new Toy("Name2", "tip", 12.49, 4,1);
		 Toy treca = new Toy("Name3", "tip", 12.30, 1987,4);
		 Toy cetvrta = new Toy("Name", "tip", 12.12, 1999, 5);
		 
		 Toy kopija = new Toy (prva);
		 
		 System.out.println(prva);
		 System.out.println(druga);
		 System.out.println(treca);
		 System.out.println(cetvrta);
		 System.out.println(kopija);
		 prva.setName("New name");	 

	}

}
