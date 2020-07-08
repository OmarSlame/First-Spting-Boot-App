package io.javaprains;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {

	@Autowired 
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public  List<Topics> getAllTopics(){
		
		return  topicService.getAllTopics();
	}
	
	
	
	@RequestMapping("/topics/{id}")
	public Optional<Topics> getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/topics")
	public void addTopic(@RequestBody Topics topics){
		 topicService.addTopic(topics);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/topics/{id}")
	public void updateTopic(@RequestBody Topics topics ,@PathVariable String id ){
		 topicService.updateTopic(topics,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id ){
		 topicService.deleteTopic(id);
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
