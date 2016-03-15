package com.libsupport.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String author;

    private String authors;

    @Column(name = "number_of_pages")
    private String numberOfPages;

    private String edition;

    @Column(name = "year_of_publish")
    private String yearOfPublish;

    @Column(name = "number_of_copies")
    private int numberOfCopies;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BookReservation> reserveBooks;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BookCopy> copiesBooks;

    @OneToMany(mappedBy="book", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Feedback> feedbacks;




}
