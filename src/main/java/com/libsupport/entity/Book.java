package com.libsupport.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOOK")
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
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

    public Book(String name, String author, String authors, String numberOfPages, String edition, String yearOfPublish, int numberOfCopies) {
        this.name = name;
        this.author = author;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.edition = edition;
        this.yearOfPublish = yearOfPublish;
        this.numberOfCopies = numberOfCopies;
    }

    public Book(String name, String author, String authors, String edition, String numberOfPages, String yearOfPublish, int numberOfCopies, List<BookReservation> reserveBooks, List<BookCopy> copiesBooks, List<Feedback> feedbacks) {
        this.name = name;
        this.author = author;
        this.authors = authors;
        this.edition = edition;
        this.numberOfPages = numberOfPages;
        this.yearOfPublish = yearOfPublish;
        this.numberOfCopies = numberOfCopies;
        this.reserveBooks = reserveBooks;
        this.copiesBooks = copiesBooks;
        this.feedbacks = feedbacks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
