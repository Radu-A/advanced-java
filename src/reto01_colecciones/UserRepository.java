package reto01_colecciones;

public interface UserRepository {
	
	// Abstract methods
	void save(User user);
	
	User searchById(String id);
}
