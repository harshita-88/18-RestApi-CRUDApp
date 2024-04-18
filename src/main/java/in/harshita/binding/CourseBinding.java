package in.harshita.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CourseBinding {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double price;

}
