package com.fotie.banking.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Role extends AbstractEntity{

    private String name;
    @OneToOne
    @JoinColumn(name = "id_user")
    private Users user;
}
