package edu.bjtu.reative.controllers;

import edu.bjtu.reative.models.Course;
import edu.bjtu.reative.services.CourseService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class CourseHandler {
    private final CourseService courseService;
    public CourseHandler(CourseService courseService) {
        this.courseService = courseService;
    }
    public Mono<ServerResponse> findById(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(courseService.findById(id), Course.class);
    }
    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(courseService.findAll(), Course.class);
    }
    public Mono<ServerResponse> save(ServerRequest request) {
        final Mono<Course> course = request.bodyToMono(Course.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(course.flatMap(courseService::save), Course.class));
    }
    public Mono<ServerResponse> delete(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(courseService.deleteById(id), Void.class);
    }
}