package com.slilicon.suyamvarm.controller;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class SuyamvaramWebController {
	
	private final static Logger logger = Logger.getLogger(SuyamvaramWebController.class.getName());
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	
    	logger.info("!!!!!!!!!!!!!!!!!!!! inside greeting");
    	logger.log(Level.INFO,"Just Samle");
    	logger.log(Level.SEVERE,"Just Samle");
    	logger.log(Level.WARNING,"Just Samle");
        model.addAttribute("name", "changed name");
        return "greeting";
    }
   
 
    @GetMapping(value = "/contactus")
    public String contactus(Model model) {
    	logger.info("!!!!!!!!!!!!!!!!!!!! inside contactus");
    	  model.addAttribute("address", "Silicon Soft Lab Pvt Ltd, #37, Pennington Road, Thanjavur, 613 001. Mob: 9360352777 ");
          return "contactus";
    }
    
    
}