package edu.bjtu.reative.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class GymRouter {
    @Bean
    public RouterFunction<ServerResponse> route(GymHandler handler) {
        return RouterFunctions
                .route(GET("/fgyms").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/fgym/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(POST("/fgym").and(accept(MediaType.APPLICATION_JSON)), handler::save)
                .andRoute(DELETE("/fgym/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
    }
}

