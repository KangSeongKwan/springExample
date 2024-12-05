package app.repository;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> 94d353515910663cbee6dfed94c7eddb213eee2b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Emp;

@Repository
<<<<<<< HEAD
public interface EmpRepository extends JpaRepository<Emp, Integer> {
    Optional<Emp> findById(Integer empno);
}
=======
public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
>>>>>>> 94d353515910663cbee6dfed94c7eddb213eee2b
