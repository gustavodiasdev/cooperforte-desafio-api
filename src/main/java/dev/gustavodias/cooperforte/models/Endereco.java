package dev.gustavodias.cooperforte.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco implements Serializable {

        @Id
        @Column(name = "NR_CEP")
        private Long cep;

        @Column(name = "NO_LOGRADOURO")
        private String logradouro;

        @Column(name = "NO_COMPLEMENTO")
        private String complemento;

        @Column(name = "NO_BAIRRO")
        private String bairro;

        @Column(name = "NO_LOCALIDADE")
        private String localidade;

        @Column(name = "NO_UF")
        private String uf;

        @Column(name = "NR_ENDERECO")
        private Long numero;

}
