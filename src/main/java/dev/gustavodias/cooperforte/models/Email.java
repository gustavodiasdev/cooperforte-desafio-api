package dev.gustavodias.cooperforte.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "TB_EMAIL")
public class Email implements Serializable {

    @Id
    @Column(name = "CD_EMAIL")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NO_EMAIL")
    private String email;


}
