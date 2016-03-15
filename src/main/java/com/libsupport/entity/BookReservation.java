package com.libsupport.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BOOK_RESERVATION")
public class BookReservation {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private LocalDate startRead;

    @Column
    private LocalDate finishRead;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
