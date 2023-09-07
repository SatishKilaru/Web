package com.reshma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {
	Service s;

	@Autowired
	public EmpController(Service s) {
		this.s = s;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model mod) {
		mod.addAttribute("emp", s.listAll());
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model mod, @RequestParam("click") String click, Employee e) {
		// mod.addAttribute("emp", s.listAll(click, empno));
		System.out.println(e.getDeptno());
		return "home";
	}
}
