package com.day7.SkillForge;

import java.util.*;
public abstract class Course{

	private String title;
	protected String instructor;
	private double rating;
	private ArrayList<String> reviews;
	protected ArrayList<String>modules;
	
	public Course(String title, String instructor) {
		this.title = title;
		this.instructor = instructor;
		this.modules = new ArrayList<>();
		this.reviews = new ArrayList<>();
	}
	public Course(String title, String instructor, String []mods) {
		this(title, instructor);
		for(String m : mods) {
			modules.add(m);
		}
	}
	public String getTitle() {
		return title;
	}
	
	protected void calculateRating() {
		rating = reviews.size();
	}
	public double getRating() {
		return rating;
	}
	
	public List<String> getReviews() {
		return Collections.unmodifiableList(reviews);
	}
	
	public void addReview(String r) {
		reviews.add(r);
		calculateRating();
		
	}

	@Override
	public String toString() {
	    return title + " by " + instructor;
	}

	public abstract String certificateFormat();
}
