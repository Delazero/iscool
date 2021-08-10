package br.com.delazari.iscool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.delazari.iscool.entity.Pessoa;
import br.com.delazari.iscool.repository.PessoaRepository;

/**
 * 
 * @author delazari
 * 
 */

@Service
public class PessoaService {
    
    @Autowired
    PessoaRepository pessoaRepository;


    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }
    
}
