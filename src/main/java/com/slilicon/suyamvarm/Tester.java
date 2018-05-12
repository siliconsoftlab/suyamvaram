package com.slilicon.suyamvarm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.gson.Gson;
import com.slilicon.suyamvarm.domain.Address;
import com.slilicon.suyamvarm.domain.Request;
import com.slilicon.suyamvarm.domain.RequestWrapper;
import com.slilicon.suyamvarm.domain.User;
import com.slilicon.suyamvarm.utils.CustomDateAndTimeDeserialize;

public class Tester {

public static void main(String[] args) {

  Gson gosn= new Gson();
  User user= new User() ;
  user.setPassword("password");
  user.setUsername("userName");
 /* Car car=new Car();
  car.setMiles(100);*/
  
  
 // @JsonDeserialize(using = CustomDateAndTimeDeserialize.class) Date createdAt;
 
/*  String inputString = "1989-11-21 00:00:00";
  SimpleDateFormat dateFormat = new SimpleDateFormat(
          "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  CustomDateAndTimeDeserialize customDateAndTimeDeserialize= new CustomDateAndTimeDeserialize();
 // customDateAndTimeDeserialize.
  Date dob = null;
  try {
	 dob = dateFormat.parse(inputString);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/
  
  Date date = new GregorianCalendar(1989, Calendar.NOVEMBER, 21).getTime();
  Address address = new Address("1558", "Kudiyana St", "Puludukudi", "Kumbakonam", "Thanjavur", "Tamil Nadu", "India", "612102", "saranchinnadurai@gmail.com", "+91","9865372613", "9865372613");
 // User newUser= new User("saran", "pradeesh", "Male", "21--11-1989", "Saivam", "Tamil", address);
  User user1=new User("Saravanan", "123456", "Male", "21-11-1989", "Hindu", "Tamil", address, "Single", "Padaiyachi", false, "Kumbakonam", "175", "normal", "B.E.,", "Software Engineer", "Private","1000");
  //user1.setIncomingRequest(new Request("1", "21-11-1989", "pending"));
 // user1.setOutgoingRequest(new Request("10", "21-11-1989", "pending"));
  RequestWrapper requestWrapper= new  RequestWrapper();
  requestWrapper.setUser(user1);
  requestWrapper.setRequest(new Request("1", "Pending"));
  String sjonBj=gosn.toJson(requestWrapper);
  System.out.println(sjonBj);
  
}
}