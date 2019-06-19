package edu.bjtu.reative.services;

import edu.bjtu.reative.models.Course;
import edu.bjtu.reative.repositories.CourseRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @Override
    public Mono<Course> findById(String id) {
        return courseRepository.findById(id);
    }
    @Override
    public Flux<Course> findAll() {
        return courseRepository.findAll();
    }
    @Override
    public Mono<Course> save(Course course) {
        return courseRepository.save(course);
    }
    @Override
    public Mono<Void> deleteById(String id) {
        return courseRepository.deleteById(id);
    }
}