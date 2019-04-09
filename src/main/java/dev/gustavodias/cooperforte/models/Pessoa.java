package dev.gustavodias.cooperforte.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TB_PESSOA")
public class Pessoa implements Serializable {

    @Id
    @Column(name = "NR_CPF_PESSOA", unique = true)
    private Long cpf;

    @Column(name = "NO_PESSOA")
    private String nome;

    @Column(name = "END_PESSOA")
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Email> emails;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones;



}
