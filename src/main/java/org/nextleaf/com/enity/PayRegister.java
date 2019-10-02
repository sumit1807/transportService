package org.nextleaf.com.enity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payregister")
public class PayRegister {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="USERNAME")
    private String userName;
	
	@Column(name="USERPASS")
    private String userPass;
	
	@Column(name="BRANCH")
    private String branch;
	
	@Column(name="DATEOFJOINING")
    private Date dateOfJoining;
	
	@Column(name="DATEOFBIRTH")
    private Date dateOfBirth;
	
	@Column(name="SALARY")
    private Double salary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
    
	

}
