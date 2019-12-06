package com.github.marciecoder.spellbook.notes.api;

import com.github.marciecoder.spellbook.notes.repository.NoteRepository;
import com.github.marciecoder.spellbook.notes.resource.Notes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class NoteController {

    private final NoteRepository noteRepository;

    @GetMapping("/notes")
    public ResponseEntity<Flux<Notes>> getNotes() {
        return new ResponseEntity<>(noteRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/notes/{id}")
    public ResponseEntity<Mono<Notes>> getNote(@PathVariable("id") String id) {
        return new ResponseEntity<>(noteRepository.findById(id), HttpStatus.OK);
    }


    @PutMapping("/notes")
    public ResponseEntity<Mono<Notes>> updateNote(@Valid @RequestBody Notes notes) {
        return new ResponseEntity<>(noteRepository.save(notes), HttpStatus.OK);
    }
}
