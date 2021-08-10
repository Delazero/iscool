package br.com.delazari.iscool.entity.enumerated;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoUsuario {

    DOCENTE(0, "Docente"), DISCENTE(1, "Discente"), FUNCIONARIO(2, "Funcionário");

    private Integer topico;
    private String descricao;

    private TipoUsuario(Integer topico, String descricao) {
        this.topico = topico;
        this.descricao = descricao;
    }

    @JsonValue
    public Integer getTopico() {
        return topico;
    }

    public void setTopico(Integer topico) {
        this.topico = topico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
