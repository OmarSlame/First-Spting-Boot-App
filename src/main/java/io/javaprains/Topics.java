package io.javaprains;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {
	
@Id
private String id;
private String name;
private String descreption;
public String getId() {
	return id;
}

public Topics() {

}

public Topics(String id, String name, String descreption) {
	super();
	this.id = id;
	this.name = name;
	this.descreption = descreption;
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
