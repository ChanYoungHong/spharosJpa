package com.prac.jpaprac.spharosJpa.nhnaccount.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    private String number;
    private Integer balance;

}
