package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAGE")
public class Stage {
	
	@Id
	@Column(name="STAGE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long stageId;
	
	@Column(name="STAGE_NAME")
	private String stageName;
	
	@Column(name="STAGE_DESC")
	private String stageDesc;

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getStageDesc() {
		return stageDesc;
	}

	public void setStageDesc(String stageDesc) {
		this.stageDesc = stageDesc;
	}

	@Override
	public String toString() {
		return "Stage [stageId=" + stageId + ", stageName=" + stageName
				+ ", stageDesc=" + stageDesc + "]";
	}

	
}
