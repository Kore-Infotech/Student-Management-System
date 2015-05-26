package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COURSE_ID")
	private Long courseId;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	@Column(name="COURSE_DESC")
	private String courseDesc;
	
	@Column(name="COURSE_INFO_URL")
	private String courseInformationURL;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseInformationURL() {
		return courseInformationURL;
	}

	public void setCourseInformationURL(String courseInformationURL) {
		this.courseInformationURL = courseInformationURL;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName
				+ ", courseDesc=" + courseDesc + ", courseInformationURL="
				+ courseInformationURL + "]";
	}


}
