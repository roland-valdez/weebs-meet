package Models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="conversation")
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "timestamp")
    private Timestamp timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp timestamp(){
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp){
        this.timestamp=timestamp;
    }


}
