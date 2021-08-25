package Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="block_user")
public class Block_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   @ManyToOne
   @JoinColumn(name = "user_id", referencedColumnName = "id")
   private User user;

   //constructor
   public Block_User(){

   }

   public Block_User(long id, User user){
       this.id=id;
       this.user = user;
   }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
