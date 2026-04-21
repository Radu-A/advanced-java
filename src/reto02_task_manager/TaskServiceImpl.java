package reto02_task_manager;

import java.util.ArrayList;
import java.util.List;

public class TaskServiceImpl implements TaskService {
	private List<Task> storage = new ArrayList<>(); 

	@Override
	public void addTask(Task t) {
		this.storage.add(t);
	}

	@Override
	public List<Task> getAllTasks() {
		List<Task> publicStorage = new ArrayList<>(this.storage);
		return publicStorage;
	}

	@Override
	public List<Task> getPendingTasks() {
		List<Task> pendingList = new ArrayList<>();
		for (Task task : storage) {
			if (!task.getIsCompleted()) {
				pendingList.add(task);
			}
		}
		return pendingList;
	}

	@Override
	public void markAsCompleted(String id) {
		this.storage.forEach(task -> {
			if (task.getId().equals(id)) task.setIsCompleted(true);
		});

	}

}
