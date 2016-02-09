package com.libsupport.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LogInfo")
public class LogInfo {

    private String username;

    private String password;
}
