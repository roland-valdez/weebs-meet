package Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade= CascadeType.ALL, mappedBy = "user")
    private List<User> users;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Post> posts;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
