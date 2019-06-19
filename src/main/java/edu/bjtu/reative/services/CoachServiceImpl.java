package edu.bjtu.reative.services;

import edu.bjtu.reative.models.Coach;
import edu.bjtu.reative.repositories.CoachRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CoachServiceImpl implements CoachService {
    private CoachRepository coachRepository;
    public CoachServiceImpl(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }
    @Override
    public Mono<Coach> findById(String id) {
        return coachRepository.findById(id);
    }
    @Override
    public Flux<Coach> findAll() {
        return coachRepository.findAll();
    }
    @Override
    public Mono<Coach> save(Coach coach) {
        return coachRepository.save(coach);
    }
    @Override
    public Mono<Void> deleteById(String id) {
        return coachRepository.deleteById(id);
    }
}