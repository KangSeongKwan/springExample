package app.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Emp;
import app.repository.EmpRepository;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public Emp updateEmployee(int empno, Emp updatedEmp) {
        Emp existingEmp = empRepository.findById(empno).orElse(null);

        if (existingEmp != null) {
            existingEmp.setEname(updatedEmp.getEname());
            existingEmp.setJob(updatedEmp.getJob());
            existingEmp.setMgr(updatedEmp.getMgr());
            existingEmp.setHiredate(updatedEmp.getHiredate());
            existingEmp.setSal(updatedEmp.getSal());
            existingEmp.setComm(updatedEmp.getComm());
            existingEmp.setDeptno(updatedEmp.getDeptno());

            return empRepository.save(existingEmp); // 직원 정보 업데이트
        } else {
            return null; // 직원이 없다면 null 반환
        }
    }
=======
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import app.entity.Dept;
import app.entity.Emp;
import app.repository.EmpRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service

public class EmpService {

	private final EmpRepository EmpRepository;
	
	@Transactional
	public Emp registerEmp(Emp newEmp) {
		return EmpRepository.save(newEmp);
	}
>>>>>>> 94d353515910663cbee6dfed94c7eddb213eee2b
}
