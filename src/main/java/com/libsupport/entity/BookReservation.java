package com.libsupport.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "BOOK_RESERVATION")
@Getter
@Setter
public class BookReservation {

    @ManyToOne
    private Book book;

    @ManyToOne
    private Reader reader;

    private LocalDate from;

    private LocalDate to;
}
