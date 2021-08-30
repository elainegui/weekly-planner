package me.ottero.weeklyPlan.priority;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriorityService {

	@Autowired
	PriorityRepository priorityRepository;

	public void addPriority(Priority priority) {
		priorityRepository.save(priority);
	}

	public List<Priority> getAllPriorities() {
		List<Priority> priorities = new ArrayList<>();
		priorityRepository.findAll().forEach(priorities::add);

		return priorities;
	}

	public void updatePriority(String id, Priority priority) {
		priorityRepository.save(priority);
	}

	public void deletePriority(String id) {
		priorityRepository.delete(Integer.parseInt(id));

	}

	public Priority getPriority(String id) {
		return priorityRepository.findOne(Integer.parseInt(id));

	}
}
