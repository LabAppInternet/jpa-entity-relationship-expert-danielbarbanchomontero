package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "permission")
public class Permission {
    @EmbeddedId
    private PermissionId id;
    private boolean canRead;
    private boolean canEdit;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "owner_id")
    private UserLab owner;

    @ManyToOne
    @MapsId("noteId")
    @JoinColumn(name = "note_id")
    private Note note;
}
