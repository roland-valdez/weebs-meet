package Models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String comment;

    @Column(name="comment_created")
    private Timestamp comment_created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getComment_created() {
        return comment_created;
    }

    public void setComment_created(Timestamp comment_created) {
        this.comment_created = comment_created;
    }
}
