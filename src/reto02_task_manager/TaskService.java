package reto02_task_manager;

import java.util.List;
import java.util.Optional;

public interface TaskService {
	
	void addTask(Task t);
	
	List<Task> getAllTasks();
	
	Optional<Task> getById(String id); 
	
	List<Task> getPendingTasks();
	
	void markAsCompleted(String id);
}
