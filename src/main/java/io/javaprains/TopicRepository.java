package io.javaprains;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.javaprains.course.Course;

public interface TopicRepository extends CrudRepository<Topics/*type of class */ , String> {

	

}
