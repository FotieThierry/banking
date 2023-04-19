package com.fotie.banking.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Users extends AbstractEntity {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Boolean active;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;
    @OneToOne
    private Adress adress;

    @OneToOne
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Contact> contact;
    @OneToOne
    private Account account;
}
