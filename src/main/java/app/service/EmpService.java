package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Emp;
import app.repository.EmpRepository;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public Emp updateEmployee(int empno, Emp updatedEmp) {
        // empno를 기준으로 직원 찾기
        Emp existingEmp = empRepository.findById(empno).orElse(null);

        if (existingEmp != null) {
            // 해당 직원 정보 업데이트
            existingEmp.setEname(updatedEmp.getEname());
            existingEmp.setJob(updatedEmp.getJob());
            existingEmp.setMgr(updatedEmp.getMgr());
            existingEmp.setHiredate(updatedEmp.getHiredate());
            existingEmp.setSal(updatedEmp.getSal());
            existingEmp.setComm(updatedEmp.getComm());
            existingEmp.setDeptno(updatedEmp.getDeptno());

            // 업데이트된 직원 저장
            return empRepository.save(existingEmp);
        } else {
            // 직원이 존재하지 않으면 예외 던짐
            throw new ResourceNotFoundException("Employee with empno " + empno + " not found");
        }
    }
}
