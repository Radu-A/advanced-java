package reto01_colecciones;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Running system!");
		
		UserRepository myRepository = new UserRepositoryImpl();
		
		User u1 = new User("U01", "Paco Jones");
		User u2 = new User("U02", "Rosa Melano");
		
		myRepository.save(u1);
		myRepository.save(u2);
		
		System.out.println(myRepository.searchById("U02").getName());
		
	}

}
