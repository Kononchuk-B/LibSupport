package com.libsupport.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "FEEDBACK")
public class Feedback {

    @Id
    @GeneratedValue
    private int id;

    private int stars;

    private String description;

    @Column(name = "date_of_publish")
    private LocalDate dateOfPublish;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Feedback(int stars) {
        this.stars = stars;
    }

}
