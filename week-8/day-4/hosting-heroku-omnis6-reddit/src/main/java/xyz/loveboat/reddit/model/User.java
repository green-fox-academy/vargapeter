package xyz.loveboat.reddit.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @Basic(optional = false)
//    @Column(nullable = false)
    private String email;

    private String password;

    private Timestamp timestamp;

    @OneToMany(mappedBy = "user")
    private List<Post> postList;

    public User() {
        Date date = new Date();
        this.timestamp = new Timestamp(date.getTime());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
