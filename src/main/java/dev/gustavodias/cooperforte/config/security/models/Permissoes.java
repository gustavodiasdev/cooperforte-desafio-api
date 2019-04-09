package dev.gustavodias.cooperforte.config.security.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TB_PERMISSOES")
public class Permissoes implements GrantedAuthority {

    @Id
    private String nomePermissao;

    @ManyToMany(mappedBy = "permissoes")
    private List<Usuario> usuarios;

    @Override
    public String getAuthority() {
        return getNomePermissao();
    }
}
