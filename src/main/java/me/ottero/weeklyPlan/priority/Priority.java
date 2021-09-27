package me.ottero.weeklyPlan.priority;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Priority class specifies the priority levels (low to high)
 * @author Elaine
 */
@Entity
public class Priority {

	@Id
	private Integer id;
	private String description;

	private String uiStyle;

	public Priority(Integer id, String description, String uiStyle) {
		super();
		this.id = id;
		this.description = description;
		this.uiStyle = uiStyle;
	}

	public Priority() {
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

	public String getUiStyle() {
		return uiStyle;
	}

	public void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
	}


}