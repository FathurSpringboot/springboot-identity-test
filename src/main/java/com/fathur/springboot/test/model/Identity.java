package com.fathur.springboot.test.model;

import javax.persistence.*;
//import jakarta.persistence.*;

@Entity
@Table(name = "identity")
public class Identity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	//@Size(min = 2, max = 50);
	private String name;
	
	@Column(name = "ssn")
	private String ssn;
	
	@Column(name = "birth_date")
	private String dob;
	
	@Column(name = "date_created")
	private String doc;
	
	@Column(name = "date_updated")
	private String dou;
	
	@Column(name = "updateby")
	private String updateby;
	
	@Column(name = "createdby")
	private String createdby;
	
	@Column(name = "isdeleted")
	private String isdeleted;
	
	
	
	

	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getSsn() {
		return ssn;
	}





	public void setSsn(String ssn) {
		this.ssn = ssn;
	}





	public String getDob() {
		return dob;
	}





	public void setDob(String dob) {
		this.dob = dob;
	}





	public String getDoc() {
		return doc;
	}





	public void setDoc(String doc) {
		this.doc = doc;
	}





	public String getDou() {
		return dou;
	}





	public void setDou(String dou) {
		this.dou = dou;
	}





	public String getUpdateby() {
		return updateby;
	}





	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}





	public String getCreatedby() {
		return createdby;
	}





	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}





	public String getIsdeleted() {
		return isdeleted;
	}





	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}





	@Override
	public String toString() {
		return "Identity [name=" + name + ", ssn=" + ssn + ", dob=" + dob + ", doc=" + doc + ", dou=" + dou
				+ ", updateby=" + updateby + ", createdby=" + createdby + ", isdeleted=" + isdeleted + "]";
	}





	
	
}
