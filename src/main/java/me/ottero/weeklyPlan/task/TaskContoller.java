package me.ottero.weeklyPlan.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RestController
public class TaskContoller {

	@Autowired
	private TaskService taskService;

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}

	@RequestMapping(method = RequestMethod.POST, value = "/tasks")
	public void addTask(@RequestBody Task task) {
		taskService.addTask(task);
	}

	@RequestMapping("/tasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}

	@RequestMapping("/tasks/{id}")
	public Task getTaskById(@PathVariable Integer id) {
		return taskService.getTaskById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/tasks/{id}")
	public void updateTask(@RequestBody Task task, @PathVariable String id) {
		taskService.updateTask(id, task);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/tasks/{id}")
	public void deleteTask(@PathVariable String id) {
		taskService.deleteTask(id);
	}

}
