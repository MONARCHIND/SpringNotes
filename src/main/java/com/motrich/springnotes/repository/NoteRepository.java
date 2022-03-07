package com.motrich.springnotes.repository;

import com.motrich.springnotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
