package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
    
}
