package edu.bjtu.reative.services;

import edu.bjtu.reative.models.Course;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CourseService {
    Mono<Course> findById(String id);
    Flux<Course> findAll();
    Mono<Course> save(Course course);
    Mono<Void> deleteById(String id);
}