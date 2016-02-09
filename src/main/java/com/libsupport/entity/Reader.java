package com.libsupport.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "READER")
@DiscriminatorValue("2")
public class Reader extends User {

    @OneToMany(mappedBy="reader", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy="reader", cascade= CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Book> books;

    @OneToMany(mappedBy="reader", cascade= CascadeType.ALL, fetch=FetchType.LAZY)
    private List<BookReservation> reservations;
}
