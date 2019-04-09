package dev.gustavodias.cooperforte.repositorys;

import dev.gustavodias.cooperforte.models.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {
}
