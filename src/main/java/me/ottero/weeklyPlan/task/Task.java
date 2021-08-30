package me.ottero.weeklyPlan.task;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	private Integer id;
	private String description;

	private String startDateTime;

	private String finishDateTime;

	private Integer idPriority;

	/*
	 * @ManyToOne
	 * private Priority priority;
	 */

	public Task(Integer id, String description, String startDateTime, String finishDateTime, Integer idPriority) {
		super();
		this.id = id;
		this.description = description;
		this.startDateTime = startDateTime;
		this.finishDateTime = finishDateTime;
		this.idPriority = idPriority;
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

	public Integer getIdPriority() {
		return idPriority;
	}

	public void setIdPriority(Integer idPriority) {
		this.idPriority = idPriority;
	}

}
