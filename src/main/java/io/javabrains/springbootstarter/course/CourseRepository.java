package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	// find course by name without implementing interface, jpa will implement it for you
	// method name format: findByPropertyName
	//public List<Course> findByName(String name);
	
	//find courses by topic id, method name format: findByObjectNamePropertyName
	public List<Course> findByTopicId(String topicId);
}
