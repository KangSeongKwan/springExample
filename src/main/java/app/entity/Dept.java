package app.entity;

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
@Table(name = "dept") // 테이블 이름이 다르면 여기에 적절히 설정

public class Dept {
	@Id
	@Column(name = "deptno")
	private Integer deptno;
	
	@Column(name="dname")
	private String dname;
	
	@Column(name = "loc")
	private String loc;
	
}
