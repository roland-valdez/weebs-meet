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

    @Column(nullable=false)
    private String photo;

    @ManyToOne
    @JoinColumn(name= "user")
    private User sender;

    @ManyToOne
    @JoinColumn(name= "user")
    private User receiver;

   public Message(){

   }

   public Message(String text){
       this.text=text;
   }
    public Message( String text, Timestamp timestamp, User sender,User receiver){
        this.text=text;
        this.timestamp=timestamp;
        this.sender = sender;
        this.receiver=receiver;
    }
   public Message(long id, String text, Timestamp timestamp, User sender,User receiver){
       this.id=id;
       this.text=text;
       this.timestamp=timestamp;
       this.sender = sender;
       this.receiver=receiver;
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

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
