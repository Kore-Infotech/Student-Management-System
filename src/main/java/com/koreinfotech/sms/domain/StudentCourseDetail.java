package com.koreinfotech.sms.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_COURSE_DETAIL")
public class StudentCourseDetail {
	
	@Id
	@Column(name="STUDENT_COURSE_DTL_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long studentCourseDetailId;
	
	@Column(name="TOTAL_AMOUNT")
	private Double totalAmount;
	
	@ManyToOne
	@JoinColumn(name="COURSE_ID")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="COURSE_STATUS_ID")
	private CourseStatus courseStatus;
	
	@ManyToOne
	@JoinColumn(name="PAYMENT_STATUS_ID")
	private PaymentStatus paymentStatus;
	
	@OneToMany(mappedBy="studentCourseDetail",cascade=CascadeType.ALL)
	private List<PaymentDetail> paymentDetails = new ArrayList<PaymentDetail>();
	
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	private Student student;

	public Long getStudentCourseDetailId() {
		return studentCourseDetailId;
	}

	public void setStudentCourseDetailId(Long studentCourseDetailId) {
		this.studentCourseDetailId = studentCourseDetailId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseStatus getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(CourseStatus courseStatus) {
		this.courseStatus = courseStatus;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public List<PaymentDetail> getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(List<PaymentDetail> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "StudentCourseDetail [studentCourseDetailId="
				+ studentCourseDetailId + ", totalAmount=" + totalAmount
				+ ", course=" + course + ", courseStatus=" + courseStatus
				+ ", paymentStatus=" + paymentStatus + ", paymentDetails="
				+ paymentDetails + "]";
	}

	
}
