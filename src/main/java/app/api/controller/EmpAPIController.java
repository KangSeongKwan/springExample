package app.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Emp;
import app.repository.EmpRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class EmpAPIController {

	private final EmpRepository empRepository;	
	
	@GetMapping("/emps")
	public List<Emp> getEmps() {
		List<Emp> emp = empRepository.findAll();
		
			if (emp.isEmpty()) {
		         throw new EntityNotFoundException("사원정보가 존재하지 않습니다.");
		    }
			
		return emp;
	}
	
}
