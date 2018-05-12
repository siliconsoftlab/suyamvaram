package com.slilicon.suyamvarm.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.mongodb.BasicDBObject;
@Document(collection = "users")
public class User {
	@Id
	private String id;
	private String username;
	private String password;
	private String gender;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private String dob ;
	private String religion;
	private String motherTongue;
	private Address address;
	private String maritalStatus;
	private String caste;
	private boolean havingDosham;
	private String currentLocation;
	private String height;
	private String physicalStatus;
	private String education;
	private String occupation;
	private String employedIn;
	private String salary;
	private List<Request> incomingRequest= new ArrayList<Request>();
	private List<Request> outgoingRequest=new ArrayList<Request>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public boolean isHavingDosham() {
		return havingDosham;
	}

	public void setHavingDosham(boolean havingDosham) {
		this.havingDosham = havingDosham;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getPhysicalStatus() {
		return physicalStatus;
	}

	public void setPhysicalStatus(String physicalStatus) {
		this.physicalStatus = physicalStatus;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmployedIn() {
		return employedIn;
	}

	public void setEmployedIn(String employedIn) {
		this.employedIn = employedIn;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	


	

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User() {
		super();

	}

	
	public User(String username, String password, String gender, String dob, String religion, String motherTongue,
			Address address) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.religion = religion;
		this.motherTongue = motherTongue;
		this.address = address;
	}

	public User(String id, String username, String password, String gender, String dob, String religion,
			String motherTongue, Address address, String maritalStatus, String caste, boolean havingDosham,
			String currentLocation, String height, String physicalStatus, String education, String occupation,
			String employedIn, String salary, List<Request> incomingRequest, List<Request> outgoingRequest) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.religion = religion;
		this.motherTongue = motherTongue;
		this.address = address;
		this.maritalStatus = maritalStatus;
		this.caste = caste;
		this.havingDosham = havingDosham;
		this.currentLocation = currentLocation;
		this.height = height;
		this.physicalStatus = physicalStatus;
		this.education = education;
		this.occupation = occupation;
		this.employedIn = employedIn;
		this.salary = salary;
		this.incomingRequest = incomingRequest;
		this.outgoingRequest = outgoingRequest;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender + ", dob="
				+ dob + ", religion=" + religion + ", motherTongue=" + motherTongue + ", address=" + address
				+ ", maritalStatus=" + maritalStatus + ", caste=" + caste + ", havingDosham=" + havingDosham
				+ ", currentLocation=" + currentLocation + ", height=" + height + ", physicalStatus=" + physicalStatus
				+ ", education=" + education + ", occupation=" + occupation + ", employedIn=" + employedIn + ", salary="
				+ salary + ", incomingRequest=" + incomingRequest + ", outgoingRequest=" + outgoingRequest + "]";
	}

	public User(String username, String password, String gender, String dob, String religion, String motherTongue,
			Address address, String maritalStatus, String caste, boolean havingDosham, String currentLocation,
			String height, String physicalStatus, String education, String occupation, String employedIn,
			String salary) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.religion = religion;
		this.motherTongue = motherTongue;
		this.address = address;
		this.maritalStatus = maritalStatus;
		this.caste = caste;
		this.havingDosham = havingDosham;
		this.currentLocation = currentLocation;
		this.height = height;
		this.physicalStatus = physicalStatus;
		this.education = education;
		this.occupation = occupation;
		this.employedIn = employedIn;
		this.salary = salary;
	}

	public List<Request> getIncomingRequest() {
		return incomingRequest;
	}

	public void setIncomingRequest(List<Request> incomingRequest) {
		this.incomingRequest = incomingRequest;
	}

	public List<Request> getOutgoingRequest() {
		return outgoingRequest;
	}

	public void setOutgoingRequest(List<Request> outgoingRequest) {
		this.outgoingRequest = outgoingRequest;
	}

	
	

}
