package com.github.marciecoder.spellbook.notes.repository;

import com.github.marciecoder.spellbook.notes.resource.Notes;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends ReactiveCassandraRepository<Notes, String> {
}
