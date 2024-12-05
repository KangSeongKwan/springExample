package app.api.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
=======
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> 94d353515910663cbee6dfed94c7eddb213eee2b
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD

import app.entity.Emp;
import app.service.EmpService;

@RestController
@RequestMapping("/api")
public class EmpAPIController {

    @Autowired
    private EmpService empService;

    // empno를 PathVariable로 받아서 동적으로 처리
    @PutMapping("/emp/{empno}")
    public ResponseEntity<Emp> updateEmployee(@PathVariable int empno, @RequestBody Emp emp) {
        // empno를 기준으로 해당 직원 정보를 업데이트
        Emp updatedEmp = empService.updateEmployee(empno, emp);

        if (updatedEmp != null) {
            return ResponseEntity.ok(updatedEmp); // 성공적으로 업데이트된 직원 반환
        } else {
            return ResponseEntity.status(404).body(null); // 직원이 없으면 404 반환
        }
    }
}
=======
import org.springframework.web.server.ResponseStatusException;

import app.service.EmpService;
import app.entity.Emp;
import app.repository.EmpRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class EmpAPIController {
    private final EmpService empService;

    // 사원 추가
	  @PostMapping("/emp")
	  public Emp registerEmp(@RequestBody Emp newEmp) {
		      Emp emp = empService.registerEmp(newEmp);
		      return emp;
	      }
    }
    @DeleteMapping("/emp/{empno}")
    public Emp deleteEmp(@PathVariable("empno") int empno) {
        Emp emp = empRepository.findById(empno).orElseThrow(() -> 
            new ResponseStatusException(HttpStatus.NOT_FOUND, "사원정보가 존재하지 않습니다")
        );
        empRepository.delete(emp);
        return emp;
    }
   
}
>>>>>>> 94d353515910663cbee6dfed94c7eddb213eee2b
