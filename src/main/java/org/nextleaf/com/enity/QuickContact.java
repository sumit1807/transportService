package org.nextleaf.com.enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quickcontact")
public class QuickContact {
	
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
    
    @Column(name="PHONE")
	private Long phone;
    
    @Column(name="NAME")
	private String name;
    
    @Column(name="EMAIL")
	private String email;
    
    @Column(name="MESSAGE")
	private String message;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
	
}
