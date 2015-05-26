package com.koreinfotech.sms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@Column(name="STUDENT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long studentId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="NAME_ON_CERT")
	private String nameOnCertificate;
	
	@Column(name="IC_NUMBER")
	private String icNumber;
	
	@Column(name="IC_NUMBER_PARENT")
	private String icNumberParent;
	
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	
	@Column(name="MOBILE_NUMBER_PARENT")
	private String mobileNumberParent;
	
	@Column(name="ALT_PHONE_NUMBER")
	private String altPhoneNumber;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="POSTAL_CODE")
	private Integer postalCode;
	
	@OneToMany(mappedBy="student",cascade=CascadeType.ALL)
	private List<StudentCourseDetail> studentCourseDetails = new ArrayList<StudentCourseDetail>();
	
	@ManyToOne
	@JoinColumn(name="STAGE_ID")
	private Stage stage;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNameOnCertificate() {
		return nameOnCertificate;
	}

	public void setNameOnCertificate(String nameOnCertificate) {
		this.nameOnCertificate = nameOnCertificate;
	}

	public String getIcNumber() {
		return icNumber;
	}

	public void setIcNumber(String icNumber) {
		this.icNumber = icNumber;
	}

	public String getIcNumberParent() {
		return icNumberParent;
	}

	public void setIcNumberParent(String icNumberParent) {
		this.icNumberParent = icNumberParent;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileNumberParent() {
		return mobileNumberParent;
	}

	public void setMobileNumberParent(String mobileNumberParent) {
		this.mobileNumberParent = mobileNumberParent;
	}

	public String getAltPhoneNumber() {
		return altPhoneNumber;
	}

	public void setAltPhoneNumber(String altPhoneNumber) {
		this.altPhoneNumber = altPhoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public List<StudentCourseDetail> getStudentCourseDetails() {
		return studentCourseDetails;
	}

	public void setStudentCourseDetails(
			List<StudentCourseDetail> studentCourseDetails) {
		this.studentCourseDetails = studentCourseDetails;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", nameOnCertificate="
				+ nameOnCertificate + ", icNumber=" + icNumber
				+ ", icNumberParent=" + icNumberParent + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", mobileNumber="
				+ mobileNumber + ", mobileNumberParent=" + mobileNumberParent
				+ ", altPhoneNumber=" + altPhoneNumber + ", email=" + email
				+ ", address=" + address + ", postalCode=" + postalCode
				+ ", studentCourseDetails=" + studentCourseDetails + ", stage="
				+ stage + "]";
	}
	
	
}
