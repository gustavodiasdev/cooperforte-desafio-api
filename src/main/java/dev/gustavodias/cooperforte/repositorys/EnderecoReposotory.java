package dev.gustavodias.cooperforte.repositorys;

import dev.gustavodias.cooperforte.models.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoReposotory extends CrudRepository<Endereco, Long> {
}
