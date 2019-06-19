package edu.bjtu.reative.repositories;

import edu.bjtu.reative.models.Course;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CourseRepository extends ReactiveMongoRepository<Course, String> {

}
