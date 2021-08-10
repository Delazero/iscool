package br.com.delazari.iscool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delazari.iscool.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
    List<Pessoa> findByEmail(String email);
}
