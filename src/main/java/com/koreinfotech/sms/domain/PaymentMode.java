package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_MODE")
public class PaymentMode {
	
	@Id
	@Column(name="PAYMENT_MODE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long paymentModeId;
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="PAYMENT_MODE_DESC")
	private String paymentModeDesc;
	
	public PaymentMode(String paymentMode, String paymentModeDesc) {
		super();
		this.paymentMode = paymentMode;
		this.paymentModeDesc = paymentModeDesc;
	}
	
	public PaymentMode() {
		super();
	}

	/**
	 * @return the paymentModeId
	 */
	public Long getPaymentModeId() {
		return paymentModeId;
	}

	/**
	 * @param paymentModeId the paymentModeId to set
	 */
	public void setPaymentModeId(Long paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * @return the paymentModeDesc
	 */
	public String getPaymentModeDesc() {
		return paymentModeDesc;
	}

	/**
	 * @param paymentModeDesc the paymentModeDesc to set
	 */
	public void setPaymentModeDesc(String paymentModeDesc) {
		this.paymentModeDesc = paymentModeDesc;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentMode [paymentModeId=");
		builder.append(paymentModeId);
		builder.append(", ");
		if (paymentMode != null) {
			builder.append("paymentMode=");
			builder.append(paymentMode);
			builder.append(", ");
		}
		if (paymentModeDesc != null) {
			builder.append("paymentModeDesc=");
			builder.append(paymentModeDesc);
		}
		builder.append("]");
		return builder.toString();
	}
	
}