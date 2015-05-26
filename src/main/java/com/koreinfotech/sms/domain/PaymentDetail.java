package com.koreinfotech.sms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_DETAIL")
public class PaymentDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PAYMENT_DETAIL_ID")
	private Long paymentDetailId;
	
	@Column(name="PAYMENT_DATE")
	private Date paymentDate;
	
	@Column(name="PAYMENT_AMOUNT")
	private Double paymentAmount;
	
	@Column(name="PAYMENT_RLZTN_DATE")
	private Date paymentRealizationDate;
	
	@Column(name="CHEQUE_NUMBER")
	private String chequeNumber;
	
	@ManyToOne
	@JoinColumn(name="PAYMENT_MODE_ID")
	private PaymentMode paymentMode;
	
	@ManyToOne
	@JoinColumn(name="STUDENT_COURSE_DTL_ID")
	private StudentCourseDetail studentCourseDetail;

	public Long getPaymentDetailId() {
		return paymentDetailId;
	}

	public void setPaymentDetailId(Long paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentRealizationDate() {
		return paymentRealizationDate;
	}

	public void setPaymentRealizationDate(Date paymentRealizationDate) {
		this.paymentRealizationDate = paymentRealizationDate;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public StudentCourseDetail getStudentCourseDetail() {
		return studentCourseDetail;
	}

	public void setStudentCourseDetail(StudentCourseDetail studentCourseDetail) {
		this.studentCourseDetail = studentCourseDetail;
	}

	@Override
	public String toString() {
		return "PaymentDetail [paymentDetailId=" + paymentDetailId
				+ ", paymentDate=" + paymentDate + ", paymentAmount="
				+ paymentAmount + ", paymentRealizationDate="
				+ paymentRealizationDate + ", chequeNumber=" + chequeNumber
				+ ", paymentMode=" + paymentMode + ", studentCourseDetail="
				+ studentCourseDetail + "]";
	}

	
}
