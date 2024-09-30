package cat.tecnocampus.notes2425.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import jakarta.persistence.*;

//Long id, UserLab owner, String title, String content, LocalDateTime creationDate, Set<Tag> tags

@Entity
@Table(name = "notes")
public class Note{
    @Id
    private long id;
    private String title;
    private String content;
    private LocalDateTime creationDate;
    @OneToMany(mappedBy = "note", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private UserLab owner;

    public Note() {}

    public Note(String title, String content, LocalDateTime creationDate) {
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        this.tags = new HashSet<>();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public LocalDateTime getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDateTime creationDate) { this.creationDate = creationDate; }
    public Set<Tag> getTags() { return tags; }
    public boolean isOwner(long id){return this.owner.getId() == id}
    public int hashCode(){
        return Objects.hash(id);
    }

}