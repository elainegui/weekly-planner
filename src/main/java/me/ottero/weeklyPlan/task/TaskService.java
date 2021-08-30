package me.ottero.weeklyPlan.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {


	@Autowired
	TaskRepository taskRepository;

	public List<Task> getAllTasks() {
		List<Task> tasks = new ArrayList<>();

		taskRepository.findAll().forEach(tasks::add);
		return tasks;
	}

	public Task getTaskById(Integer id) {
		return taskRepository.findOne(id);
	}

	public void addTask(Task task) {
		taskRepository.save(task);
	}

	public void updateTask(String id, Task task) {
		taskRepository.save(task);
	}

	public void deleteTask(String id) {
		taskRepository.delete(Integer.parseInt(id));
	}

}
