package edu.asu.dota2guide;

import java.io.Serializable;

public class Hero implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int imageId;
	private String name;
	private String type;
	private String description;
	
	public Hero() {
		imageId = R.drawable.ic_launcher;
		name = "";
		type = "";
		description = "";
	}
	
	public Hero(int imageId, String name, String type, String description) {
		this.imageId = imageId;
		this.name = name;
		this.type = type;
		this.description = description;
	}
	
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public int getImageId() {
		return imageId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}
