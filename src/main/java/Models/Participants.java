package Models;

import javax.persistence.*;

@Entity
@Table(name="participants")
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


}
