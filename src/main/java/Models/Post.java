package Models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = true)
    private String video;

    @Column(nullable = true)
    private String image;

    @Column(name="post_created")
    private java.sql.Date post_created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getPost_created() {
        return post_created;
    }

    public void setPost_created(Date post_created) {
        this.post_created = post_created;
    }
}
