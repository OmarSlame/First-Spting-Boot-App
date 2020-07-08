package io.javaprains.course;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javaprains.Topics;


@RestController
public class CourseController {

	@Autowired 
	private CourseService courseService;
	
	
	@RequestMapping("/topics/{topicId}/courses")
	public  List<Course> getAllCourse(@PathVariable String topicId){
		
		return  courseService.getAllCourse(topicId);
	}
	
	
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id){
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/topics/{topicId}/courses/{id}")
	public void addCourse(@RequestBody Course course ,@PathVariable String topicId){
		course.setTopic(new Topics(topicId,"",""));
		 courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course ,@PathVariable String id,@PathVariable String topicId ){
		course.setTopic(new Topics(topicId,"",""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id ){
		 courseService.deleteCourse(id);
	}
	
	
	/*
	//We can use a single method for handling multiple URIs, for example:
	@RequestMapping(value={"/method1","/method1/second"})
	public String method1(){
		return "method1";
	}
	*/
	
	/*
	 	//We can use a single method for handling multiple http method, for example:

		@RequestMapping(value="/method3", method={RequestMethod.POST,RequestMethod.GET})
		@ResponseBody
		public String method3(){
		return "method3";
		}
 */
	
}
