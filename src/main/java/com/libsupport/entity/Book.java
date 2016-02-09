package com.libsupport.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOOK")
@Getter
@Setter
public class Book {

    @ManyToOne
    private Reader reader;

    @OneToMany(mappedBy="book", cascade= CascadeType.ALL, fetch=FetchType.LAZY)
    private List<BookReservation> reserveBooks;
}
