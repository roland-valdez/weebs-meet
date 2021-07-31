package Models;

import javax.persistence.*;

@Entity
@Table(name="block_user")
public class Block_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}