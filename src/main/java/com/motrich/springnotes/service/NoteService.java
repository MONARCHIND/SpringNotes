package com.motrich.springnotes.service;

import com.motrich.springnotes.model.Note;
import com.motrich.springnotes.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note findById(Long id){
        return noteRepository.getById(id);
    }

    public List<Note> findAll(){
        return noteRepository.findAll();
    }

    public Note saveNote(Note note){
        return noteRepository.save(note);
    }
    public void deleteById(Long id){
        noteRepository.deleteById(id);
    }
}
