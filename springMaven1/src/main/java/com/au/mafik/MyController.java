package com.au.mafik;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.au.mafik.dao.DAO;
import com.au.mafik.model.UserDTO;

@RequestMapping
@Component
public class MyController {
	@Autowired
	private DAO dao;
	
	
	//@RequestMapping("/login")
	
	/*
	 * @RequestMapping(value="/login",method = RequestMethod.POST) public String
	 * login(@RequestParam String username, @RequestParam String password) {
	 * 
	 * if (password.equals("azam1234")) { return "rspn1.jsp"; } return "rspn2.jsp";
	 * }
	 */
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {
		
		if (password.equals("azam1234")) {
			return new ModelAndView("rspn1","msg","login Success Mr/Mrs. "+username);
		}
		return new ModelAndView("rspn1","msg","login Failed ");
	}
	
	/*
	 * @RequestMapping("/registration") public String registration(@ModelAttribute
	 * UserDTO dto) { System.out.println(dto); return "rspn1.jsp"; }
	 */
	

	@RequestMapping("/registration")
	public ModelAndView registration(@ModelAttribute UserDTO dto) {
		//System.out.println(dto);
		dao.saveDTO(dto);
		
		return new ModelAndView("rspn2","user",dto);
	}
	
	@RequestMapping("/listUser")
	public ModelAndView listUser(@ModelAttribute UserDTO dto) {
		UserDTO dto1=new UserDTO();
		dto1.setUsername("Harsh");
		
		UserDTO dto2=new UserDTO();
		dto2.setUsername("Bijoy");
		
		UserDTO dto3=new UserDTO();
		dto3.setUsername("Mafik");
		
		ArrayList<UserDTO> list=new ArrayList<UserDTO>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		return new ModelAndView("rspn3","userList",list);
	}
	
	
}
