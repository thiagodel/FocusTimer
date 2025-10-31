package com.focustimer.focustimer.model;

public enum TypeSession {

    //Tipos de sessões pré definidos
    FOCO("Foco"),
    PAUSA_CURTA("Pausa Curta"),
    PAUSA_LONGA("Pausa Longa");

    private final String descricao;

    TypeSession(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
