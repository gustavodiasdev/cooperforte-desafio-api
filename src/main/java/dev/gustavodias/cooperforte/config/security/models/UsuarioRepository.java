package dev.gustavodias.cooperforte.config.security.models;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsuario(String usuario);
}
