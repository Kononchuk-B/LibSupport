package com.libsupport.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "FEEDBACK")
@Getter
@Setter
public class Feedback {

    private int stars;

    private String description;

    private LocalDate dateOfPublish;

    @ManyToOne
    private Reader reader;

}
