package com.documentManager.repository;

import com.documentManager.model.tmf667.Document;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface DocumentRepository extends ReactiveMongoRepository<Document, String> {
    Flux<Document> findAllBy(PageRequest pageRequest);
}