package app.service;

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

	private final EmpRepository empRepository;

	
	// 특정 사원 정보 조회
	@Transactional
	public Emp getEmpByEmpno(Integer empno) {
		return empRepository.findById(empno).orElseThrow(() -> new EntityNotFoundException(" msg :사원정보가 존재하지 않습니다."));
	}
	
	// 사원 생성
	@Transactional
	public Emp registerEmp(Emp newEmp) {
		return empRepository.save(newEmp);
	}

	// 사원 수정
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
}
