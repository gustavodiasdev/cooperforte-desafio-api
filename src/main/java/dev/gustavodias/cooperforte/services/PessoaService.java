package dev.gustavodias.cooperforte.services;

import dev.gustavodias.cooperforte.models.Pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa cadastrarPessoa(Pessoa pessoa);

    void deletarPessoa(Long id);

    List<Pessoa> listaPessoas();

    Pessoa atualizarPessoa(Pessoa pessoa);

}
