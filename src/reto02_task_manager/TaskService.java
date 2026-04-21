package reto02_task_manager;

import java.util.List;

public interface TaskService {
	
	void addTask(Task t);
	
	List<Task> getAllTasks();
	
	List<Task> getPendingTasks();
	
	void markAsCompleted(String id);
}
