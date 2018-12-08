/**
 * 
 */
package com.springBoot.api.entity;

import javax.persistence.Id;

/**
 * @author Mudit Raina
 *
 */
public class CourseEntity {
	
	@Id
	private String courseId;
	private String courseName;
	private String courseFees;
	private String courseStrength;
	
	public CourseEntity() {
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(String courseFees) {
		this.courseFees = courseFees;
	}
	public String getCourseStrength() {
		return courseStrength;
	}
	public void setCourseStrength(String courseStrength) {
		this.courseStrength = courseStrength;
	}
	public CourseEntity(String courseId, String courseName, String courseFees, String courseStrength) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.courseStrength = courseStrength;
	}

}
