package app.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.entity.Emp;
import app.repository.EmpRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class EmpAPIController {

	private final EmpRepository empRepository;
	
    @DeleteMapping("/emp/{empno}")
    public Emp deleteEmp(@PathVariable("empno") int empno) {
        Emp emp = empRepository.findById(empno).orElseThrow(() -> 
            new ResponseStatusException(HttpStatus.NOT_FOUND, "사원정보가 존재하지 않습니다")
        );
        empRepository.delete(emp);
        return emp;
    }
   
}