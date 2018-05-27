package com.slilicon.suyamvarm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.slilicon.suyamvarm.domain.RequestWrapper;
import com.slilicon.suyamvarm.domain.User;
import com.slilicon.suyamvarm.service.RequestService;
import com.slilicon.suyamvarm.service.UserService;

@RestController
@RequestMapping("/suyamvaram/v1")
public class SuyamvaramRestController {
	private static final Logger logger = LoggerFactory.getLogger(SuyamvaramRestController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private RequestService requestService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody User user) {
		logger.info("login");
		if (user.getUsername() != null && user.getUsername() != "" && user.getPassword() != null
				&& user.getPassword() != "") {
			user = userService.login(user);
			if (user != null) {
				return new ResponseEntity<User>(user, HttpStatus.OK);
			} else {
				return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<User>(user, HttpStatus.NO_CONTENT);
		}

	}

	@RequestMapping(value = "/register", method = RequestMethod.PUT)
	public ResponseEntity<?> register(@RequestBody User user) {
		logger.info("register " + user.toString());

		if (user.getUsername() != null && user.getUsername() != "" && user.getPassword() != null
				&& user.getPassword() != "") {
			user = userService.register(user);
			if (user != null) {
				return new ResponseEntity<User>(user, HttpStatus.OK);
			} else {
				return new ResponseEntity<User>(user, HttpStatus.NOT_IMPLEMENTED);
			}

		} else {
			return new ResponseEntity<User>(user, HttpStatus.NO_CONTENT);
		}

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public ResponseEntity<?> logout(@RequestBody User user) {
		logger.info("register");
		user = userService.logout(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@RequestMapping(value = "/unregister", method = RequestMethod.DELETE)
	public ResponseEntity<?> unregister(@RequestBody User user) {
		logger.info("register");
		String regStaus = userService.unregister(user);
		if(regStaus.equalsIgnoreCase("Success")) {
			return new ResponseEntity<String>(regStaus, HttpStatus.OK);
		}else {
			return new ResponseEntity<String>(regStaus, HttpStatus.NOT_IMPLEMENTED);
		}
		

	}

	@RequestMapping(value = "/newRequest", method = RequestMethod.POST)
	public ResponseEntity<?> newRequest(@RequestBody RequestWrapper request) {
		logger.info("********** New Request *************");
		logger.info("user " + request.getUser().toString());
		logger.info("request " + request.toString());
		String res = requestService.newRequest(request.getUser(), request.getRequest());
		return new ResponseEntity<String>(res, HttpStatus.OK);

	}

	@RequestMapping(value = "/updateRequest", method = RequestMethod.POST)
	public ResponseEntity<?> updateRequest(@RequestBody RequestWrapper request) {
		logger.info("********** Updating Request *************");
		logger.info("user " + request.getUser().toString());
		logger.info("request " + request.toString());
		String res = requestService.updateRequest(request.getUser(), request.getRequest());
		return new ResponseEntity<String>(res, HttpStatus.OK);

	}
	
	
	
	

	@RequestMapping("/greeting")
	public @ResponseBody String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		return "Welcome Mr. " + name;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<?> test() {
		logger.info("********** REST *************");
		User user = new User("saravanan", "password");
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
	

}
