package dev.gustavodias.cooperforte.repositorys;

import dev.gustavodias.cooperforte.models.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
