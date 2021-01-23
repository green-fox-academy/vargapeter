package xyz.loveboat.reddit.model;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long rating = 0L;

    @Type(type = "text")
    private String title;

    @Type(type = "text")
    private String content;

    private Timestamp timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Post() {
        Date date = new Date();
        this.timestamp = new Timestamp(date.getTime());
    }

}



