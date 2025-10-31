package com.focustimer.focustimer.model;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Declaração da tabela do banco de dados
@Entity(name = "session")
public class Session {

    // Coluna da chave primária da tabela e a geração automática do id
    @Id
    @Column(name = "id_session")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Tipos das sessões pré determinados com o enum TypeSession.
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false, length = 20)
    private TypeSession tipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tempo", nullable = false)
    private int tempo;

    @Column(name = "data", nullable = false)
    @CreationTimestamp
    private String data;

    public Session() {
    }

    public Session(TypeSession tipo, int tempo, String data) {
        this.tipo = tipo;
        this.tempo = tempo;
        this.data = data;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public TypeSession getTipo() {
        return tipo;
    }

    public int getTempo() {
        return tempo;
    }

    public String getData() {
        return data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTipo(TypeSession tipo) {
        this.tipo = tipo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setData(String data) {
        this.data = data;
    }

}
