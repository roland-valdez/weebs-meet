//package Models;
//
//import javax.persistence.*;
//import java.sql.Date;
//import java.util.List;
//
//@Entity
//@Table(name="users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, length = 30)
//    private String email;
//
//    @Column(nullable = false,length = 15)
//    private String firstName;
//
//    @Column(nullable = false, length = 35)
//    private String lastName;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Column (nullable = true)
//    private String user_Img;
//
//    @Column(nullable = false,length = 20)
//    private String username;
//
//    @Column(name="comment_created")
//    private java.sql.Date user_created;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
//    private List<Post> posts;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
//    private List<Comment> comments;
//
////    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
////    private List<Like> likes;
////
////    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
////    private List<Message> messages;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
//    private List<Conversation> conversations;
//
//    public User(){
//
//    }
//
//    public User(Long id, String email, String firstName, String lastName, String password, String username) {
//        this.id = id;
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.password = password;
//        this.username=username;
//    }
//
//    public User(String email, String firstName, String lastName, String password, String user_Img, String username, Date user_created) {
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.password = password;
//        this.user_Img = user_Img;
//        this.username = username;
//        this.user_created = user_created;
//    }
//
//    public User(User copy){
//        id= copy.id;
//        email= copy.email;
//        firstName = copy.firstName;
//        lastName= copy.lastName;
//        password= copy.password;
//        username = copy.username;
//        user_created = copy.user_created;
//        user_Img = copy.user_Img;
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUser_Img() {
//        return user_Img;
//    }
//
//    public void setUser_Img(String user_Img) {
//        this.user_Img = user_Img;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//}
