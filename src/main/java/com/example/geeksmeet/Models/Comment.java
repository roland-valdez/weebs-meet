//package Models;
//
//import javax.persistence.*;
//import java.sql.Date;
//import java.sql.Timestamp;
//
//@Entity
//@Table(name="comment")
//public class Comment {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column(nullable = true, length = 255)
//    private String comment;
//
//    @Column(name="comment_created")
//    private Timestamp comment_created;
//
//    @ManyToOne
//    @JoinColumn(name= "post_id", referencedColumnName = "id")
//    private Post post;
//
//    @ManyToOne
//    @JoinColumn(name="user_id", referencedColumnName = "id")
//    private User user;
//
//
//    //constructor
//    public Comment(){
//    }
//
//    public Comment(String comment, User user, Post post, Timestamp comment_created){
//        this.comment= comment;
//        this.user= user;
//        this.post= post;
//        this.comment_created = comment_created;
//    }
//
//    public Comment(long id, String comment, Post post, User user, Timestamp comment_created){
//        this.comment_created = comment_created;
//        this.id = id;
//        this.comment = comment;
//        this.user= user;
//        this.post=post;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public Timestamp getComment_created() {
//        return comment_created;
//    }
//
//    public void setComment_created(Timestamp comment_created) {
//        this.comment_created = comment_created;
//    }
//
//    public Post getPost() {
//        return post;
//    }
//
//    public void setPost(Post post) {
//        this.post = post;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
