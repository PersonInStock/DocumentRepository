package com.documentManager.controller;

import com.documentManager.model.tmf667.Document;
import com.documentManager.repository.DocumentRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tmf-api/document/v4")
public class DocumentController {

    private final DocumentRepository documentRepository;

    public DocumentController(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @PostMapping("/saveDocument")
    public Mono<ResponseEntity<String>> saveDocument(@RequestBody Document document) {
        return documentRepository.findById(document.getId())
                .flatMap(existingDocument -> {
                    String message = "Document with ID: " + existingDocument.getId() + " already exists";
                    return Mono.just(new ResponseEntity<>(message, HttpStatus.CONFLICT));
                })
                .switchIfEmpty(documentRepository.save(document)
                        .map(savedDocument -> {
                            String message = "Document with ID " + savedDocument.getId() + " created successfully";
                            return new ResponseEntity<>(message, HttpStatus.CREATED);
                        }));
    }

    @GetMapping("/getDocuments")
    public Flux<Document> listDocuments(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return documentRepository.findAllBy(pageRequest);
    }

    @GetMapping("/document/{id}")
    public Mono<ResponseEntity<Document>> retrieveDocument(@PathVariable String id) {
        return documentRepository.findById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/document/{id}")
    public Mono<ResponseEntity<Void>> deleteDocument(@PathVariable String id) {
        return documentRepository.findById(id)
                .flatMap(existingDocument ->
                        documentRepository.delete(existingDocument)
                                .then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
                )
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}