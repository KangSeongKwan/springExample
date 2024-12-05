package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Emp;
import app.service.EmpService;


@RestController
@RequestMapping("/api")
public class EmpAPIController {

    private final EmpService empService;

    public EmpAPIController(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("/emp/{empno}")
	public Emp getEmpByEmpno(@PathVariable Integer empno) {
		Emp emp = empService.getEmpByEmpno(empno);
		return emp;
	}
}
