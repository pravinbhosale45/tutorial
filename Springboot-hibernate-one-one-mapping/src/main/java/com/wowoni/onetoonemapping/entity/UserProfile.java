package com.wowoni.onetoonemapping.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_profiles")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "phone_number")
	private String PhoneNumber;
	
	@Column(name = "address")
	private String address;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;
	
	@Column(name = "birth_of_date")
	private LocalDate birthofDate;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "userProfile")
	private User user;
	
	public UserProfile() {
		
	}
	
	public UserProfile(String phoneNumber, String address, Gender gender, LocalDate birthofDate) {
		super();
		PhoneNumber = phoneNumber;
		address = address;
		this.gender = gender;
		this.birthofDate = birthofDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getBirthofDate() {
		return birthofDate;
	}
	public void setBirthofDate(LocalDate birthofDate) {
		this.birthofDate = birthofDate;
	}
	
	public User getUser() {
		return user;
		
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
