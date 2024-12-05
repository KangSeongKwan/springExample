package app.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
