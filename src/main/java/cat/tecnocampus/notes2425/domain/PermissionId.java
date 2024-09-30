package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class PermissionId {
    private long noteId;
    private long userId;

    public PermissionId() {
    }

    public PermissionId(long noteId, long userId) {this.noteId = noteId; this.userId = userId;}

    public long getNoteId() { return this.noteId;}
    public void setNoteId(long noteId) { this.noteId = noteId; }
    public long getUserId() { return this.userId; }
    public void setUserId(long userId) { this.userId = userId; }

}
