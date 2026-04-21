package reto02_task_manager;

public class Main {

	public static void main(String[] args) {
		
		Task t1 = new Task("Salir, beber, el rollo de siempre", true);
		Task t2 = new Task("Meterme mil rayas", true);
		Task t3 = new Task("Hablar con la gente", false);
		Task t4 = new Task("Llegar a la cama y joder que guarrada sin ti", false);
		
		TaskService service = new TaskServiceImpl();
		
		service.addTask(t1);
		service.addTask(t2);
		service.addTask(t3);
		service.addTask(t4);
		
		System.out.println(service.getAllTasks());
		System.out.println(service.getPendingTasks().toString());
		
		service.markAsCompleted(t3.getId());
		System.out.println(service.getPendingTasks().toString());
		
		service.
	}

}
