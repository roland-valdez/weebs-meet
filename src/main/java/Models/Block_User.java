package Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="block_user")
public class Block_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "user")
    private List<User> users;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
