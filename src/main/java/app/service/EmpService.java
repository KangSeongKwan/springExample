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

	private final EmpRepository EmpRepository;
	
	@Transactional
	public Emp registerEmp(Emp newEmp) {
		return EmpRepository.save(newEmp);
	}
}
