package app.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "EMP") // 테이블 이름이 다르면 여기에 적절히 설정

public class Emp {
    @Id
    @Column(name = "EMPNO") // 대문자 컬럼 이름 매핑
    private int empno;

    @Column(name = "ENAME")
    private String ename;

    @Column(name = "JOB")
    private String job;

    @Column(name = "MGR")
    private Integer mgr;

    @Column(name = "HIREDATE")
    private LocalDate hiredate;

    @Column(name = "SAL")
    private Double sal;

    @Column(name = "COMM")
    private Double comm;

    @Column(name = "DEPTNO")
    private int deptno;
  
  	@Builder
	  public Emp(int empno, String ename, String job, Integer mgr, LocalDate hiredate, Double sal, Double comm, int deptno) {
      this.empno = empno;
      this.ename = ename;
      this.job = job;
      this.mgr = mgr;
      this.hiredate = hiredate;
      this.sal = sal;
      this.comm = comm;
      this.deptno = deptno;
	  }
}
