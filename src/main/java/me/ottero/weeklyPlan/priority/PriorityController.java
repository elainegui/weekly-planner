package me.ottero.weeklyPlan.priority;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriorityController {

	@Autowired
	PriorityService priorityService;

	@RequestMapping(method = RequestMethod.POST, value = "/priorities")
	public void addPriority(@RequestBody Priority priority) {
		priorityService.addPriority(priority);
	}

	@RequestMapping("/priorities")
	public List<Priority> getAllPriorities() {
		return priorityService.getAllPriorities();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/priorities/{id}")
	public void updatePriority(@RequestBody Priority priority, @PathVariable String id) {
		priorityService.updatePriority(id, priority);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/priorities/{id}")
	public void deletePriority(@PathVariable String id) {
		priorityService.deletePriority(id);
	}

	@RequestMapping(value = "/priorities/{id}")
	public Priority getPriority(@PathVariable String id) {
		return priorityService.getPriority(id);
	}

}
