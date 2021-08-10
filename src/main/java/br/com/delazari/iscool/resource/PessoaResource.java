package br.com.delazari.iscool.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.delazari.iscool.entity.Pessoa;
import br.com.delazari.iscool.service.PessoaService;

@Path("/pessoa")
public class PessoaResource {

    @Autowired
    PessoaService pessoaService;

    @GET
    @Path("/all")
    public List<Pessoa> listar() {
        return pessoaService.listar();
    }

    @POST
    @Path("/salvar")
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaService.salvar(pessoa);
    }
}
