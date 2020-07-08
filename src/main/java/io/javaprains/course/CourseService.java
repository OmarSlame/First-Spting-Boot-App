package io.javaprains.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	

public List<Course> getAllCourse(String topicId){
	
List <Course> topics0 = new ArrayList<>();
courseRepository.findByTopicId(topicId).forEach(topics0::add);
return topics0;

}

public Optional<Course> getCourse(String id){
	
return courseRepository.findById(id);
}

public void addCourse(Course course) {
	courseRepository.save(course);
	
}

public void updateCourse(Course course) {
	
	courseRepository.save(course);// if there is a row in the DB has the same id as topics2.id then it will update that row with topics2
	
}

public void deleteCourse(String id) {
	
	courseRepository.deleteById(id);
}

}
