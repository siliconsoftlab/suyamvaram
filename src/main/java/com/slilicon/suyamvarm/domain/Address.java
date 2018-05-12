package com.slilicon.suyamvarm.domain;

public class Address {
private String doorNo,street,place,city,district, state, country,pincode,email, countryCode, mobileNo, whatsappNo;

public String getDoorNo() {
	return doorNo;
}

public void setDoorNo(String doorNo) {
	this.doorNo = doorNo;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getDistrict() {
	return district;
}

public void setDistrict(String district) {
	this.district = district;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getWhatsappNo() {
	return whatsappNo;
}

public void setWhatsappNo(String whatsappNo) {
	this.whatsappNo = whatsappNo;
}

public Address() {
	super();
}


public String getCountryCode() {
	return countryCode;
}

public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}



public Address(String doorNo, String street, String place, String city, String district, String state, String country,
		String pincode, String email, String countryCode, String mobileNo, String whatsappNo) {
	super();
	this.doorNo = doorNo;
	this.street = street;
	this.place = place;
	this.city = city;
	this.district = district;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
	this.email = email;
	this.countryCode = countryCode;
	this.mobileNo = mobileNo;
	this.whatsappNo = whatsappNo;
}

@Override
public String toString() {
	return "Address [doorNo=" + doorNo + ", street=" + street + ", place=" + place + ", city=" + city + ", district="
			+ district + ", state=" + state + ", country=" + country + ", pincode=" + pincode + ", email=" + email
			+ ", countryCode=" + countryCode + ", mobileNo=" + mobileNo + ", whatsappNo=" + whatsappNo + "]";
}




}
