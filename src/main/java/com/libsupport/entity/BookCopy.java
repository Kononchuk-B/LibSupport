package com.libsupport.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BOOK_COPY")
public class BookCopy {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "date_of_supply")
    private LocalDate dateOfSupply;

    @Column(name = "is_available")
    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
