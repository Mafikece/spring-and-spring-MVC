package com.au.mafik;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.au.mafik.dao.DAO;
import com.au.mafik.model.UserDTO1;

@Controller
public class MyController {
	@Autowired
	private DAO dao;
	
	@RequestMapping("/registration")
	public String registration() {
		return "register";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute UserDTO1 dto) {
		dao.save(dto);
		return "saved";
}
	@RequestMapping("/viewUser")
	public ModelAndView view(UserDTO1 m){
		List<UserDTO1> list = dao.usersDetails();
		return new ModelAndView("view","users",list);
		
	}

	@RequestMapping("/edituser/{id}")
	public ModelAndView editUser(@PathVariable int id) {
		UserDTO1 dto1 = dao.getUserById(id);
		return new ModelAndView("editform", "user", dto1);
		
	}
	
	@RequestMapping(value="/updateSave",method=RequestMethod.POST)
	public String update(@ModelAttribute UserDTO1 userup) {
		dao.saveupdate(userup);
		return "redirect:/viewUser"; 
		
	}
	@RequestMapping(value="/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		dao.delete(id);
		return "redirect:/viewUser";
	}
	
}