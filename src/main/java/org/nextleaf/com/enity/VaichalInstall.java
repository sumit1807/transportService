package org.nextleaf.com.enity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaichal_install")
public class VaichalInstall {
	
	@Id
    @Column(name="VID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long vId;
	
	@Column(name="VMODEL")
	private String vModel;
	
	@Column(name="VNUMBER")
	private String vNumber;
	
	@Column(name="VINSURANCE")
	private String vInsurance;
	
	@Column(name="VINAME")
	private String vIName;
	
	@Column(name="VOWNER")
	private String vOwner;
	
	@Column(name="VFROM")
	private String vFrom;
	
	@Column(name="VTO")
	private String vTo;
	
	@Column(name="VIDATE")
	private Date vIDate;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="MOBILE")
	private Long mobile;

	public Long getvId() {
		return vId;
	}

	public void setvId(Long vId) {
		this.vId = vId;
	}

	public String getvModel() {
		return vModel;
	}

	public void setvModel(String vModel) {
		this.vModel = vModel;
	}

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}

	public String getvInsurance() {
		return vInsurance;
	}

	public void setvInsurance(String vInsurance) {
		this.vInsurance = vInsurance;
	}

	public String getvIName() {
		return vIName;
	}

	public void setvIName(String vIName) {
		this.vIName = vIName;
	}

	public String getvOwner() {
		return vOwner;
	}

	public void setvOwner(String vOwner) {
		this.vOwner = vOwner;
	}

	public String getvFrom() {
		return vFrom;
	}

	public void setvFrom(String vFrom) {
		this.vFrom = vFrom;
	}

	public String getvTo() {
		return vTo;
	}

	public void setvTo(String vTo) {
		this.vTo = vTo;
	}

	public Date getvIDate() {
		return vIDate;
	}

	public void setvIDate(Date vIDate) {
		this.vIDate = vIDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	
	
}
