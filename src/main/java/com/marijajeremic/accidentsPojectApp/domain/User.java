package com.marijajeremic.accidentsPojectApp.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String username;

    private String password;



}
