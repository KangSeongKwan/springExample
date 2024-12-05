package app.service;
import org.springframework.stereotype.Service;

import app.entity.Emp;
import app.repository.EmpRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmpService{

	private final EmpRepository empRepository;
	
    @Transactional
	public Emp getEmpByEmpno(Integer empno) {
		return empRepository.findById(empno)
								.orElseThrow(() -> new EntityNotFoundException(" msg :사원정보가 존재하지 않습니다."));
	}
}
