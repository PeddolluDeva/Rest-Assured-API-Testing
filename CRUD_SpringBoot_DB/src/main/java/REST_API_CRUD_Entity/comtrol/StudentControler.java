package REST_API_CRUD_Entity.comtrol;

import org.springframework.web.bind.annotation.RestController;

import REST_API_CRUD_Entity.stud;
import REST_API_CRUD_StudentRepository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentControler {

	@Autowired
	StudentRepository repo;
	
	@GetMapping("/student")

	
	public List<stud> getAllStudent(){
		List<stud> st =repo.findAll();
		return st;
	}
	
	
	
}
