package com.mindtree.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.model.LoginModel;

@Controller
public class HomeController {
	
	
	
	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "hiii Sreekar");
        return "login";
    }
	
	@RequestMapping(method = RequestMethod.POST)
	  public String submit(Model model, @ModelAttribute("loginBean") LoginModel loginBean) {
	    if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
	      if (loginBean.getUserName().equals("sreekar") && loginBean.getPassword().equals("123456")) {
	        model.addAttribute("msg", loginBean.getUserName());
	        return "login";
	      } else {
	        model.addAttribute("error", "Invalid Details");
	        return "login";
	      }
	    } else {
	      model.addAttribute("error", "Please enter Details");
	      return "login";
	    }
	  }
     
	
	
	
	

}
