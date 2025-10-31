package com.focustimer.focustimer.model;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "session")
public class Session {

    @Id
    @Column(name = "id_session")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tempo", nullable = false)
    private int tempo;

    @Column(name = "data", nullable = false)
    @CreationTimestamp
    private String data;

    public Session() {
    }

    public Session(String tipo, int tempo, String data) {
        this.tipo = tipo;
        this.tempo = tempo;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setData(String data) {
        this.data = data;
    }

}
