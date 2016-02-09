package com.libsupport.entity;

import javax.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDate;

@Entity
@Table(name = "USER")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "userType", discriminatorType = DiscriminatorType.INTEGER )
public abstract class User {

    @Id
    @Column(unique = true)
    private String login;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String address;

    private LocalDate dateOfBirth;

    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    private LogInfo logInfo;

}
