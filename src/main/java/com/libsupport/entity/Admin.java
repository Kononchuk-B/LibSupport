package com.libsupport.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
@DiscriminatorValue("1")
public class Admin extends User {

}
