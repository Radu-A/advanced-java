package reto02_task_manager;

import java.util.UUID;

public class Task {
	private String id;
	private String description;
	private boolean isCompleted;
	
	public Task (String description, boolean completed) {
		this.id = UUID.randomUUID().toString();
		this.description = description;
		this.isCompleted = completed;
	}
	
	public String toString() {
		return String.format("Task %s: %s. State: %b.", this.id, this.description, this.isCompleted);
	}
	
	// getters
	public String getId() {
		return this.id;
	}
	public String getDescription() {
		return this.description;
	}
	public boolean getIsCompleted() {
		return this.isCompleted;
	}
	
	//setters
	public void setDescription(String description) {
		this.description = description;
	}
	public void setIsCompleted(boolean completed) {
		this.isCompleted = completed;
	}
}
