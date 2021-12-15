package com.example.MysqlConnect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springController {
	
	@Autowired
	Repo repo;

	@RequestMapping("/home")
	@ResponseBody
	public String home(student s)
	{
		repo.save(s);
		return "saved";
	}
	
}
