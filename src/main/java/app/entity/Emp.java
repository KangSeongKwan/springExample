package app.entity;

import java.time.LocalDate;
<<<<<<< HEAD

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP")
public class Emp {
    @Id
    private int empno;
    private String ename;
    private String job;
    private Integer mgr;
    private LocalDate hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;

    // 기본 생성자
    public Emp() {}

    // 매개변수 있는 생성자
    public Emp(int empno, String ename, String job, Integer mgr, LocalDate hiredate, Double sal, Double comm, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    // Getter 메소드
    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public Double getComm() {
        return comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    // Setter 메소드
    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
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
    private String hiredate;

    @Column(name = "SAL")
    private double sal;

    @Column(name = "COMM")
    private double comm;

    @Column(name = "DEPTNO")
    private int deptno;
  
  	@Builder
	  public Emp(int empno, String ename, String job, Integer mgr, LocalDate hiredate, Double sal, Double comm, Dept dept) {
      this.empno = empno;
      this.ename = ename;
      this.job = job;
      this.mgr = mgr;
      this.hiredate = hiredate;
      this.sal = sal;
      this.comm = comm;
      this.dept = dept;
	  }
>>>>>>> 94d353515910663cbee6dfed94c7eddb213eee2b
}
