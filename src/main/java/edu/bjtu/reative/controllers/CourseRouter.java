package edu.bjtu.reative.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class CourseRouter {
    @Bean
    public RouterFunction<ServerResponse> route(CourseHandler handler) {
        return RouterFunctions
                .route(GET("/fcourses").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/fcourse/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(POST("/fcourse").and(accept(MediaType.APPLICATION_JSON)), handler::save)
                .andRoute(DELETE("/fcourse/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
    }
}