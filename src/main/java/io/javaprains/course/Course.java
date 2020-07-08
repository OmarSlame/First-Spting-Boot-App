package io.javaprains.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javaprains.Topics;

@Entity
public class Course {
	
@Id
private String id;
private String name;
private String descreption;
@ManyToOne
private Topics topic;

public Topics getTopic() {
	return topic;
}

public void setTopic(Topics topic) {
	this.topic = topic;
}

public String getId() {
	return id;
}

public Course() {

}

public Course(String id, String name, String descreption ,String topicId) {
	super();
	this.id = id;
	this.name = name;
	this.descreption = descreption;
	this.topic = new Topics ("topicId", "","");
}

public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescreption() {
	return descreption;
}
public void setDescreption(String descreption) {
	this.descreption = descreption;
}

}
