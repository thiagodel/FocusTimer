package com.focustimer.focustimer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity(name = "user")
public class User {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username", nullable = false, length = 50, unique = true)
    @NotBlank(message = "O nome de usuário não pode ser vazio")
    private String username;

    @Column(name = "email", nullable = false, length = 100, unique = true)
    @Email(message = "Email inválido")
    @NotBlank(message = "O email não pode ser vazio")
    private String email;

    @Column(name = "password", nullable = false)
    @NotBlank(message = "A senha não pode ser vazia")
    @Size(min = 6, max = 20, message = "A senha deve ter no mínimo 6 caracteres e no máximo 20 caracteres")
    private String password;

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
