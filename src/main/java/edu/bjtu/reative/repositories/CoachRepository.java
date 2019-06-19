package edu.bjtu.reative.repositories;

import edu.bjtu.reative.models.Book;
import edu.bjtu.reative.models.Coach;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CoachRepository extends ReactiveMongoRepository<Coach, String> {

}
