package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Tag")
public  class Tag {
    @Id
    private long id;
    private String name;

    public Tag() {}

    public Tag(long id, String name) { this.id = id; this.name = name; }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Note getNote() { return note; }
    public void setNote(Note note) { this.note = note; }

}
