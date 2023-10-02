package com.devmountain.noteApp.dtos;

import com.devmountain.noteApp.entries.Note;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class NoteDto implements Serializable {

    private long id;
    private String body;
    private UserDto userDto;



    public NoteDto(Note note) {
        if (note.getId() > 0) {
            this.id = note.getId();
        }
        if (note.getBody() != null) {
            this.body = note.getBody();
        }

    }


}
