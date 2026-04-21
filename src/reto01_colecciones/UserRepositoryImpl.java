package reto01_colecciones;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
	private Map<String, User> dataBaseMap = new HashMap<>();

	@Override
	public void save(User user) {
		this.dataBaseMap.put(user.getId(), user);
	}

	@Override
	public User searchById(String id) {
		return dataBaseMap.get(id);
	}

	
}
