package Models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 200)
    private String description;

    @Column(nullable = true)
    private String video;

    @Column(nullable = true)
    private String image;

    @Column(name="post_created")
    private java.sql.Timestamp post_created;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;

    public Post(String title, String video, String image, String description) {
    this.title=title;
    this.description=description;
    this.image=image;
    this.video=video;
    }

    public long getId() {
        return id;
    }

    public Post(){

    }

    public Post(String description,String title, String video, String image, Timestamp post_created, User user) {
        this.description = description;
        this.video = video;
        this.image = image;
        this.post_created = post_created;
        this.user = user;
        this.title=title;
    }

    public Post(long id,String title, String description, String video, String image, Timestamp post_created, User user) {
        this.id = id;
        this.description = description;
        this.video = video;
        this.image = image;
        this.post_created = post_created;
        this.user = user;
        this.title=title;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getPost_created() {
        return post_created;
    }

    public void setPost_created(Timestamp post_created) {
        this.post_created = post_created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
