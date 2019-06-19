package edu.bjtu.reative.services;

import edu.bjtu.reative.models.Coach;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoachService {
    Mono<Coach> findById(String id);
    Flux<Coach> findAll();
    Mono<Coach> save(Coach coach);
    Mono<Void> deleteById(String id);
}