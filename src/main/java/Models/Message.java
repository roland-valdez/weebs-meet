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
    private String message;

    @Column
    private Timestamp timestamp;


}
