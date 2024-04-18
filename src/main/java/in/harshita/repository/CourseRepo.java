package in.harshita.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.harshita.binding.CourseBinding;

public interface CourseRepo extends JpaRepository<CourseBinding, Serializable>{

}
