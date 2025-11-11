package com.prova.eliel.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nome;
    String matricula;
    Enum status;
    //======================================================================
    public Aluno() {
    }
    //======================================================================

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    //======================================================================

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Enum getStatus() {
        return status;
    }
}
