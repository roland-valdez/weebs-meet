package Models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String text;

    @Column
    private Timestamp timestamp;

    @ManyToOne
    @JoinColumn(name= "user")
    private User user;

   public Message(){

   }

   public Message(String text){
       this.text=text;
   }
   public Message(long id, String text, Timestamp timestamp, User user){
       this.id=id;
       this.text=text;
       this.timestamp=timestamp;
       this.user = user;
   }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
