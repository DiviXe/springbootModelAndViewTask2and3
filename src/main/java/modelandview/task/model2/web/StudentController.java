package modelandview.task.model2.web;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import modelandview.task.model2.domain.Student;


@Controller
public class StudentController {

	@GetMapping("/hello")
	public String getStudents( Model model) {
		model.addAttribute("students", Arrays.asList(
				new Student("John", "Arge"),
				new Student("Matti", "Mökkönen"),
				new Student("Lepa", "Erkki"),
				new Student("Terve", "Juusto")));
		
		return "studentlist";
	}
	
	
}


