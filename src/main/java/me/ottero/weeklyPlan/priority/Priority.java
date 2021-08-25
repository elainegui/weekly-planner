package me.ottero.weeklyPlan.priority;

public class Priority {
	private int id;
	private String description;
	private String uiStyle;

	public Priority(int id, String description, String uiStyle) {
		super();
		this.id = id;
		this.description = description;
		this.uiStyle = uiStyle;
	}

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

	public String getUiStyle() {
		return uiStyle;
	}

	public void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
	}


}