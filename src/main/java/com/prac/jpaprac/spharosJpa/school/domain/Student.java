package com.prac.jpaprac.spharosJpa.school.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlIDREF;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    private Long id;
    private String name;
    private Integer score;

}
