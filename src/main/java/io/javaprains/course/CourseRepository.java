package io.javaprains.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course/*type of class */ , String> {
	public List<Course> findByName(String Name);
	//public List<Course> findByDescreption(String desc);
	
	
	public List<Course> findByTopicId(String T);
	//public List<Course> findByTopicName (String name)
}
