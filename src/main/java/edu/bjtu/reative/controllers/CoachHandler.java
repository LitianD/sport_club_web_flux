package edu.bjtu.reative.controllers;

import edu.bjtu.reative.models.Coach;
import edu.bjtu.reative.services.CoachService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class CoachHandler {
    private final CoachService coachService;
    public CoachHandler(CoachService coachService) {
        this.coachService = coachService;
    }
    public Mono<ServerResponse> findById(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(coachService.findById(id), Coach.class);
    }
    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(coachService.findAll(), Coach.class);
    }
    public Mono<ServerResponse> save(ServerRequest request) {
        final Mono<Coach> user = request.bodyToMono(Coach.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(user.flatMap(coachService::save), Coach.class));
    }
    public Mono<ServerResponse> delete(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(coachService.deleteById(id), Void.class);
    }
}