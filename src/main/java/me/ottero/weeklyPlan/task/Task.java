package me.ottero.weeklyPlan.task;

public class Task {
	private int id;
	private String description;
	private String startDateTime;
	private String finishDateTime;
	private int priorityId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}

	public Task(int id, String description, String startDateTime, String finishDateTime, int priorityId) {
		super();
		this.id = id;
		this.description = description;
		this.startDateTime = startDateTime;
		this.finishDateTime = finishDateTime;
		this.priorityId = priorityId;
	}




}
