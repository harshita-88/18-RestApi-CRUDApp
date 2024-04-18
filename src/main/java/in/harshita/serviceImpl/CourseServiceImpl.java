package in.harshita.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.harshita.binding.CourseBinding;
import in.harshita.repository.CourseRepo;
import in.harshita.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo repo;

	@Override
	public String upsurt(CourseBinding course) {
		repo.save(course);
		return "Success";
	}

	@Override
	public CourseBinding getById(Integer id) {
		Optional<CourseBinding> findbyid = repo.findById(id);
		if(findbyid.isPresent()) {
			return findbyid.get();
		}
		return null;
	}

	@Override
	public List<CourseBinding> getAllById() {
		
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if(repo.existsById(id)){
			repo.deleteById(id);
			return "deleted";
		}
		else {
			return"record not found";
		}
	}

}
