//package Models;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="participants")
//public class Participants {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @ManyToOne
//    @JoinColumn(name= "user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name= "conversation_id")
//    private Conversation conversation;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Conversation getConversation() {
//        return conversation;
//    }
//
//    public void setConversation(Conversation conversation) {
//        this.conversation = conversation;
//    }
//}
