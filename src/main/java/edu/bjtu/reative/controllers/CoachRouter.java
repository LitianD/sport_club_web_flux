package edu.bjtu.reative.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class CoachRouter {
    @Bean
    public RouterFunction<ServerResponse> route(CoachHandler handler) {
        return RouterFunctions
                .route(GET("/fcoachs").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/fcoach/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(POST("/fcoach").and(accept(MediaType.APPLICATION_JSON)), handler::save)
                .andRoute(DELETE("/fcoach/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
    }
}