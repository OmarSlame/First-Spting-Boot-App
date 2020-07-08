package io.javaprains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	

public List<Topics> getAllTopics(){
	
List <Topics> topics0 = new ArrayList<>();
topicRepository.findAll().forEach(topics0::add);
return topics0;

}

public Optional<Topics> getTopic(String id){
	
return topicRepository.findById(id);
}

public void addTopic(Topics topics2) {
	topicRepository.save(topics2);
	
}

public void updateTopic(Topics topics2, String id) {
	
	topicRepository.save(topics2);// if there is a row in the DB has the same id as topics2.id then it will update that row with topics2
	
}

public void deleteTopic(String id) {
	
	topicRepository.deleteById(id);
}

}
