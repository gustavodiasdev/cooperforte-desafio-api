package dev.gustavodias.cooperforte.repositorys;

import dev.gustavodias.cooperforte.models.Telefone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends CrudRepository<Telefone, Long> {
}
