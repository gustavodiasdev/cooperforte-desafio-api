package dev.gustavodias.cooperforte.services.impl;

import dev.gustavodias.cooperforte.models.Pessoa;
import dev.gustavodias.cooperforte.repositorys.PessoaRepository;
import dev.gustavodias.cooperforte.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }


    @Override
    public Pessoa cadastrarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }

    @Override
    public List<Pessoa> listaPessoas() {
        return (List<Pessoa>) pessoaRepository.findAll();
    }

    @Override
    public Pessoa atualizarPessoa(Pessoa pessoa) {
        return null;
    }
}
