package me.ottero.weeklyPlan.task;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import me.ottero.weeklyPlan.priority.Priority;

@Entity
public class Task {
	@Id
	private Integer id;
	private String description;

	private String startDateTime;

	private String finishDateTime;

	// private Integer idPriority;


	@ManyToOne
	@JoinColumn(name = "id_priority")
	private Priority priority;


	public Task(Integer id, String description, String startDateTime, String finishDateTime, Priority priority) {
		super();
		this.id = id;
		this.description = description;
		this.startDateTime = startDateTime;
		this.finishDateTime = finishDateTime;
		this.priority = priority;
	}

	public Task() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getFinishDateTime() {
		return finishDateTime;
	}

	public void setFinishDateTime(String finishDateTime) {
		this.finishDateTime = finishDateTime;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

}
