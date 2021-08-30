package me.ottero.weeklyPlan.task;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {

// public List<Task> findByTaskId(String taskId);
}
