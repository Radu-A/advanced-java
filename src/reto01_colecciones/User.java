package reto01_colecciones;

// import java.util.UUID;

public class User {
	private String id;
	private String name;
	
	// constructors
	public User(String id,  String name) {
		// this.id = UUID.randomUUID().toString();
		this.id = id;
		this.name = name;
	}
	
	// getters
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	 
	// setter
	public void setName(String name) {
		this.name = name;
	}
}
