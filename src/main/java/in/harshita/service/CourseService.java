package in.harshita.service;

import java.util.List;

import in.harshita.binding.CourseBinding;

public interface CourseService {
	
	public String upsurt(CourseBinding course);
	
	public CourseBinding getById(Integer id);
	
	public List<CourseBinding> getAllById();
	
	public String deleteById(Integer Id);
	
}
