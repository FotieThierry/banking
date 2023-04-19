package com.fotie.banking.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
public class Adress extends AbstractEntity{

    private String street;
    private Integer houseNumber;
    private String zipCode;
    private String city;
    private String country;
    @OneToOne
    @JoinColumn(name = "id_user")
    private Users user;
}
