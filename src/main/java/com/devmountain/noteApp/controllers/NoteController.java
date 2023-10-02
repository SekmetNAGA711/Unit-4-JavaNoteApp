package com.devmountain.noteApp.controllers;


import com.devmountain.noteApp.dtos.NoteDto;
import com.devmountain.noteApp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping("/user/{userId}")
    public void addNote(@RequestBody NoteDto noteDto, @PathVariable Long userId) {
        noteService.addNote(noteDto, userId);
    }

    @DeleteMapping("/user/{userId}")
    public void deleteNoteById(@PathVariable Long noteId) {
        noteService.deleteNoteById(noteId);
    }

    @PutMapping
    public void updateNoteById(@RequestBody NoteDto noteDto) {
        noteService.updateNoteById(noteDto);
    }

    @GetMapping("/user/{userId}")
    public List<NoteDto> getAllNotesByUserId(@PathVariable Long userId) {
        return noteService.getAllNotesByUserId(userId);
    }



}
