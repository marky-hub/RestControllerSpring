package demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import demo.model.Student;
@Controller
public class StudentController {
	
	@GetMapping("/students")
	public String getAllStudent (Model model) {
		Student s = new Student();
		s.setName("Mark");
		s.setId("S01");
		s.setGrade(3.56);
		model.addAttribute("s",s);
		return "/index";
	}


	

}
