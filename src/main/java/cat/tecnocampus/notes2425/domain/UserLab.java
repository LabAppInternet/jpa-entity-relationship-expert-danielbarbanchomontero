package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "userlab")
public class UserLab {
    @Id
    private long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "userlab", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<Tag> notes;

    public UserLab() {}

    public UserLab(long id, String name, String email) {this.id = id; this.name = name; this.email = email; }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Set<Tag> getNotes() { return notes; }
    public void setNotes(Set<Tag> notes) { this.notes = notes; }

}
